package com.chance.ssm.utils.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.chance.ssm.utils.RandomUtil;


public class FileUpload {

	@SuppressWarnings("unused")
	//采用何种命名方式
	/**
	 * savePath 保存路径
	 * file 文件
	 * saveFileName 采用何种文件命名
	 * **/
	public String file(String savePath, MultipartFile file, String saveFileName)
			throws IOException {
		System.out.println("文件传送");
		System.out.println("savePath" + savePath);
		// 一
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(1024 * 1024 * 5);
		// 文件保存地址
		java.io.File temDirectory = new java.io.File(savePath);
		factory.setRepository(temDirectory);
		/**
		 * // ServletFileUpload upload = new ServletFileUpload(factory);
		 * //设置文件上传大小 upload.setSizeMax(1024 * 1024 * 5);
		 */
		FileItem items = ((CommonsMultipartFile) file).getFileItem();
		// List<FileItem> items = upload.parseRequest(request);
		System.out.println("items" + items);
		String filedName = null;
		String fileName = null;
		String  NewFilenName = null;
		if (saveFileName.equals("")) {
			// 遍历item
			// 若是一个一般的表单域
			if (items.isFormField()) {
				String name = items.getFieldName();
				String value = items.getString();
				System.out.println(name + ":" + value);
			} else { // 若是文件域则把文件保存到文件夹下
				filedName = items.getFieldName();
				fileName = items.getName();
				String contentype = items.getContentType();
				long sizeInBytes = items.getSize();

				System.out.println("filedName=" + filedName);
				System.out.println("fileName=" + fileName);
				System.out.println("contentype=" + contentype);
				System.out.println("sizeInBytes=" + sizeInBytes);

				InputStream in = items.getInputStream();
				byte[] buffer = new byte[1024];
				int len = 0;
				fileName = savePath + fileName;
				System.out.println("2fileName=" + fileName);

				OutputStream out = new FileOutputStream(fileName);
				while ((len = in.read(buffer)) != -1) {
					out.write(buffer, 0, len);
				}
				out.close();
				in.close();
			}
		
		}else {
			// 遍历item
			// 若是一个一般的表单域
			if (items.isFormField()) {
				String name = items.getFieldName();
				String value = items.getString();
				System.out.println(name + ":" + value);
			} else { // 若是文件域则把文件保存到文件夹下
				filedName = items.getFieldName();
//				fileName = new Date().getTime()+RandomUtil.generateNumber2()+items.getName();
				//获取文件名
				fileName=items.getName();
				
				
				int position = fileName.lastIndexOf(".");
				String suffix = fileName.substring(position);
				
				System.out.println("suffix="+suffix);
				NewFilenName = new Date().getTime()+RandomUtil.generateNumber2()+suffix;
				String contentype = items.getContentType();
				long sizeInBytes = items.getSize();

				System.out.println("filedName=" + filedName);
				System.out.println("fileName=" + fileName);
				System.out.println("fileName=" + NewFilenName);
				System.out.println("contentype=" + contentype);
				System.out.println("sizeInBytes=" + sizeInBytes);

				InputStream in = items.getInputStream();
				byte[] buffer = new byte[1024];
				int len = 0;
				fileName = savePath + NewFilenName;
				System.out.println("2fileName=" + NewFilenName);

				OutputStream out = new FileOutputStream(NewFilenName);
				while ((len = in.read(buffer)) != -1) {
					out.write(buffer, 0, len);
				}
				out.close();
				in.close();
			}
		}
		return fileName;
	}
	
	// 上传多文件文件之直接写入
		public String uploadIcon(HttpServletRequest request,MultipartFile pic,// 接收文件
				String savePath// 保存路径
		) throws Exception {
			
			String pathPicture = request.getSession().getServletContext()
					.getRealPath("");
			String newPicturePath = pathPicture + "/" + "NurseImg" + "/" +savePath+"/";
			// 原始名称
			String originalFilename = pic.getOriginalFilename();
			String fileName = null;
			// 上传图片
			if (pic != null && originalFilename != null
					&& originalFilename.length() > 0) {
				// 存储图片的物理路径
				// String pic_path = "C:\\Users\\Administrator\\Desktop\\上传文件\\";
				// String pic_path = "/mnt/images/replies/";
				// 新的图片名称
				String newFileName = UUID.randomUUID()
						+ originalFilename.substring(originalFilename
								.lastIndexOf("."));
				// 新图片
				File newFile = new File(newPicturePath + newFileName);
				// 将内存中的数据写入磁盘
				pic.transferTo(newFile);
				fileName = "nurseDoor/NurseImg" + "/" +savePath+"/"+newFileName;
				System.out.println(fileName);
			}
			return fileName;
		}
}
