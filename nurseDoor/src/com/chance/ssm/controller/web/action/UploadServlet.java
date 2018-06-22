package com.chance.ssm.controller.web.action;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class UploadServlet extends HttpServlet {
		@SuppressWarnings("rawtypes")
		public void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			try{
			final long MAX_SIZE = 3* 1024 * 1024;// 设置上传文件最大为 3M
			// 允许上传的文件格式的列表
			final String[] allowedExt = new String[] {"jpg","jpeg","gif"};
			response.setContentType("text/html");
			// 实例化一个硬盘文件工厂,用来配置上传组件ServletFileUpload
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			dfif.setSizeThreshold(4096);// 设置上传文件时用于临时存放文件的内存大小,这里是4K.多于的部分将临时存在硬盘
			dfif.setRepository(new File(request.getRealPath("/")+ "upload"));// 设置存放临时文件的目录,web根目录下的upload目录
			// 用以上工厂实例化上传组件
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			// 设置最大上传尺寸
			sfu.setSizeMax(MAX_SIZE);
			// 从request得到 所有 上传域的列表
			List fileList = null;
			try {
				fileList = sfu.parseRequest(request);
			} catch (FileUploadException e) {// 处理文件尺寸过大异常
				if (e instanceof SizeLimitExceededException) {
					out.println("文件尺寸超过规定大小:" + MAX_SIZE + "字节!");
					return;
				}
				e.printStackTrace();
			}
			// 没有文件上传
			if (fileList == null || fileList.size() == 0) {
				out.println("请选择上传文件!");
				return;
			}
			// 得到所有上传的文件
			Iterator fileItr = fileList.iterator();
			// 循环处理所有文件
			while (fileItr.hasNext()) {
				FileItem fileItem = null;
				String path = null;
				long size = 0;
				// 得到当前文件
				fileItem = (FileItem) fileItr.next();
				// 忽略简单form字段而不是上传域的文件域(<input type="text" />等)
				if (fileItem == null || fileItem.isFormField()) {
					continue;
				}
				// 得到文件的完整路径
				path = fileItem.getName();
				// 得到文件的大小
				size = fileItem.getSize();
				if ("".equals(path) || size == 0) {
					out.println("请选择上传文件!");
					return;
				}
				// 得到去除路径的文件名
				String t_name = path.substring(path.lastIndexOf("//") + 1);//kaola.jpeg
				// 得到文件的扩展名(无扩展名时将得到全名)
				String t_ext = t_name.substring(t_name.lastIndexOf(".") + 1);//jpeg
				// 拒绝接受规定文件格式之外的文件类型
				 String tmp=Arrays.toString(allowedExt);
				 Pattern p = Pattern.compile(t_ext);  
			     Matcher m = p.matcher(tmp); 
			     if (m.find()==true) {
			    	//如果符合上传的格式
						String now=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
						// 根据系统时间生成上传后保存的文件名
						String prefix = now;
						// 保存的最终文件完整路径,保存在web根目录下的upload目录下
						String u_name = request.getRealPath("/") + "upload/"
								+ prefix + "." + t_ext;
						try {
							File file = new File(u_name);
							// 保存文件
							fileItem.write(file);
							out.println("文件上传成功. 已保存为: " + prefix + "." + t_ext
									+ " &nbsp;&nbsp;文件大小: " + size + "字节<p />");
						} catch (Exception e) {
							e.printStackTrace();
						}
				}else {
					out.print("上传文件不符合规定!");
				}
			}
			}catch(Exception e){
				out.print("系统异常,请稍后再试!");
				e.printStackTrace();
			}
		}
		
	}