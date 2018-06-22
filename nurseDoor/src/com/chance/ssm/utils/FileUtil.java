package com.chance.ssm.utils;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

public class FileUtil {
	private FileUtil(){}

	/**
	 * 根据文件编号删除文件
	 * 
	 * @param identifier
	 *            文件编号
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public static String identifierDelete(String identifier,
			HttpServletRequest request) throws Exception {
		String pathPicture = request.getSession().getServletContext()
				.getRealPath("");
		File file = new File(pathPicture + "/ZoneImg/" + identifier + ".jpg");
		file.delete();
		return pathPicture;
	}

	

	/**
	 * 获取项目web根路径   格式如下:
	 * 			H:\Program Files\apache\tomcat\apache-tomcat-8.5.5\webapps\Sexton,
	 * 			H:\Program Files\apache\tomcat\apache-tomcat-8.5.5\webapps\
	 * @param request
	 * @param make
	 * 			标识符位置
	 * @return
	 */
	public static String getWebPath(HttpServletRequest request,String make) {
		String str=request.getSession().getServletContext().getRealPath("");
		String str1=(String) str.subSequence(0, str.indexOf(make));
		return str1;
	}
	
	public static String getPoject(HttpServletRequest request) {
		return request.getSession().getServletContext().getRealPath("");
	}
	public static String getPoject(HttpServletRequest request,String path) {
		return request.getSession().getServletContext().getRealPath("")+"\\"+path+"\\";
	}

	/**
	 * 分割出路径中的编号 裁剪前路径:<blockquote>H:\Program
	 * Files\apache\tomcat\tomcat-7.0.70\webapps
	 * \Sexton/ZoneImg/119765483.jpg</blockquote>
	 * 
	 * 裁剪后路径: 119765483
	 * 
	 * @param str
	 *            需要裁剪的路径
	 * @return 裁剪后路径
	 */
	public static String identifierSplit(String str) {
		String[] str1 = str.split("/");
		String str2 = str1[str1.length - 1];
		String[] str3 = str2.split("\\.");
		return str3[0];
	}
}
