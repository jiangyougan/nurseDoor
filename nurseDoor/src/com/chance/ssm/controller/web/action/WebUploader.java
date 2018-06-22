package com.chance.ssm.controller.web.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.chance.ssm.po.ManageNursingContentWithBLOBs;
import com.chance.ssm.service.ManageNursingContentService;

/**
 * WebUploader图片上传控制类
 * 
 * @author Administrator
 * 
 */
@Controller
public class WebUploader {
	@Autowired
	private ManageNursingContentService mNursingContentService;

	/**
	 * 多图片上传
	 * @param request
	 * @param response
	 * @param multipartRequest
	 * @param session
	 * @param model
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "WebUploader")
	public String WebUploader(HttpServletRequest request, HttpServletResponse response, MultipartHttpServletRequest multipartRequest, HttpSession session, Model model) throws IOException {
		String fileName = null;
		String uploadpath = null;
		String newuploadpath=null;
		List<String> listPicPath = new ArrayList<String>();
		MultipartFile file = multipartRequest.getFile("file");//获取上传文件
		String uploadfileName = file.getOriginalFilename();//获取上传名字
		int position = uploadfileName.lastIndexOf(".");
		String suffix = uploadfileName.substring(position);
		Calendar c = Calendar.getInstance();
		for(int i = 0; i < file.getSize(); i++){
			fileName = ""+c.get(Calendar.YEAR) + (c.get(Calendar.MONTH)+1) + c.get(Calendar.DAY_OF_MONTH) + c.get(Calendar.HOUR_OF_DAY)+c.get(Calendar.MINUTE) + c.get(Calendar.SECOND)+i+suffix;
			uploadpath = request.getSession().getServletContext().getRealPath("/NurseImg/webuploader/images");//上传路径
			//uploadpath = newuploadpath+"/NurseImg/webuploader/images";
			File f = new File(uploadpath);
			if(!f.exists()){
				f.mkdirs();
			}
		}
		//开始上传
		byte[] bytes = file.getBytes();
		FileOutputStream fos = new FileOutputStream(uploadpath+File.separator+fileName);//上传到上传路径
		
		listPicPath.add(uploadpath+File.separator+fileName);
		
		
		String urls = "";
//		String newurls = "";
		//循环拼接路径
		for(int i = 0; i < listPicPath.size(); i++){
			 urls = listPicPath.get(i)+",";
			 urls = urls.substring(urls.indexOf("nurseDoor"));
			 urls += urls;
		}
		
		fos.write(bytes);//写入文件
		fos.flush();
		fos.close();//关闭IO
		//获取session里面的值
		String projectid = (String) session.getAttribute("projectid");
		String contentid = (String) session.getAttribute("contentid");
		//清空session
		session.removeAttribute("projectid");
		session.removeAttribute("contentid");
		//去掉字符串最后一个逗号
		String urlssub = urls.substring(0, urls.length()-1);
		//把图片路径写入session
		session.setAttribute("imgurl", urlssub);
		model.addAttribute("imgurl", urlssub);
		model.addAttribute("projectid", projectid);
		model.addAttribute("contentid", contentid);
		return "content-add";

	}

}
