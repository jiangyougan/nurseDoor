package com.chance.ssm.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletResponse;

public class Snippet {

	/**
	 * 把接受的全部文件打成压缩包
	 * 
	 * @param List
	 *            <File>;
	 * @param org
	 *            .apache.tools.zip.ZipOutputStream
	 */
	public static void zipFile(List<File> files, ZipOutputStream outputStream) {
		int size = files.size();
		for (int i = 0; i < size; i++) {
			File file = files.get(i);
			zipFile(file, outputStream);
		}
	}

	public static HttpServletResponse downloadZip(File file,
			HttpServletResponse response) {
		try {
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(
					file.getPath()));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();

			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment;filename="
					+ file.getName());
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				File f = new File(file.getPath());
				f.delete();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return response;
	}

	/**
	 * 根据输入的文件与输出流对文件进行打包
	 * 
	 * @param File
	 * @param org
	 *            .apache.tools.zip.ZipOutputStream
	 */
	public static void zipFile(File inputFile, ZipOutputStream ouputStream) {
		try {
			if (inputFile.exists()) {
				/**
				 * 如果是目录的话这里是不采取操作的， 至于目录的打包正在研究中
				 */
				if (inputFile.isFile()) {
					FileInputStream IN = new FileInputStream(inputFile);
					BufferedInputStream bins = new BufferedInputStream(IN, 512);
					// org.apache.tools.zip.ZipEntry
					ZipEntry entry = new ZipEntry(inputFile.getName());
					ouputStream.putNextEntry(entry);
					// 向压缩文件中输出数据
					int nNumber;
					byte[] buffer = new byte[512];
					while ((nNumber = bins.read(buffer)) != -1) {
						ouputStream.write(buffer, 0, nNumber);
					}
					// 关闭创建的流对象
					bins.close();
					IN.close();
				} else {
					try {
						File[] files = inputFile.listFiles();
						for (int i = 0; i < files.length; i++) {
							zipFile(files[i], ouputStream);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 复制文件
	 * 
	 * @param fileName1
	 * @param fileName2
	 * @throws IOException
	 */
	public static void copyFile(String fileName1, String fileName2)
			throws IOException {
		FileInputStream fis = new FileInputStream(fileName1);
		FileOutputStream fos = new FileOutputStream(fileName2);
		if (null == fis || null == fos) {
			return;
		}
		int temp;
		while ((temp = fis.read()) != -1) {
			fos.write(temp);
		}
		fis.close();
		fos.close();
		System.out.println("从" + fileName1 + "到" + fileName2);
	}

	/**
	 * 复制重命名
	 * 
	 * @param localPath
	 * @param file1
	 * @param file2
	 */
	public static File cutRename(String localPath, String file1, String file2) {
		File f = null;
		try {
			copyFile(localPath + file1, localPath + file2);// 复制
			f = new File(localPath + file2);
			System.out.println("成功" + file2);
			System.out.println(file1);
		} catch (IOException e) {
			System.out.println("失败" + file2);
			e.printStackTrace();
		}
		return f;
	}

	private static Pattern FilePattern = Pattern.compile("[\\\\/:*?\"<>|]");

	/**
	 * 去除文件中的非法字符
	 * 
	 * @param str
	 * @return
	 */
	public static String filenameFilter(String str) {
		return str == null ? null : FilePattern.matcher(str).replaceAll("");
	}

}
