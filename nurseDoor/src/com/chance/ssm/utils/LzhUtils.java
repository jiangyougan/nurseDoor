package com.chance.ssm.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class LzhUtils {

	/**
	 * Base64 编 码
	 * 
	 * @return compiledString是编码后的结果
	 * @throws IOException
	 */
	public static String base64Encoded(String url) throws IOException {
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		in = new FileInputStream(url);
		data = new byte[in.available()];
		in.read(data);
		in.close();
		// 对字节数组Base64编码
		BASE64Encoder encoder = new BASE64Encoder();
		String compiledString = encoder.encode(data);
		return compiledString;
	}

	/**
	 * Base64 解 码 参数：compiledString（编译后的字符串） url(存入的地址)
	 * 
	 * @throws IOException
	 *             url为输出存储后的位置
	 */
	public static void base64Decode(String compiledString, String url) throws IOException {

		BASE64Decoder decoder = new BASE64Decoder();
		// Base64解码
		byte[] a = decoder.decodeBuffer(compiledString);
		for (int i = 0; i < a.length; ++i) {
			if (a[i] < 0) {// 调整异常数据
				a[i] += 256;
			}
		}
		OutputStream riteout = new FileOutputStream(new File(url));
		riteout.write(a);
		riteout.flush();
		riteout.close();
	}

	// 存储视频流到服务端
	public static void h264Decode(String video, String url) throws IOException {
		OutputStream riteout = new FileOutputStream(new File(url));
		if (video.length() > 0) {
			if (video.length() > 1024) {
				int number = video.length() / 1024;
				int num = 0;
				while (number == num) {
					String str = video.substring(0 + 1024 * num, 1023 + 1024 * num);
					byte[] byt = new byte[1024];
					byt = str.getBytes();
					riteout.write(byt);
					num++;
				}
				String str = video.substring(number * 1024);
				byte[] byt = new byte[str.length()];
				byt = str.getBytes();
				riteout.write(byt);
			} else {
				byte[] byt = new byte[video.length()];
				byt = video.getBytes();
				riteout.write(byt);
			}
		}
		riteout.flush();
		riteout.close();
	}

	// 判断和创建文件夹
	public static void createFolder(String Folderurl) throws IOException {
		File file = new File(Folderurl);
		// 如果文件夹不存在则创建
		if (!file.exists() && !file.isDirectory()) {
			System.out.println("//不存在");
			file.mkdir();
		} else {
			System.out.println("//目录存在");
		}
	}

	// 判断和删除指定文件
	public static void deleteFile(String FileUrl) throws Exception {
		File file = new File(FileUrl);
		if (!file.exists() && !file.isDirectory()) {
			System.out.println("//不存在");
		} else {
			System.out.println("//存在");
			file.delete();
		}
	}

	public static File createFile(String path) {
		File file = new File(path);
		if (!file.exists() && !file.isDirectory()) {
			System.out.println("//不存在");
			return null;
		} else {
			System.out.println("//存在");
			return file;
		}
	}

	/**
	 * 基于余弦定理求两经纬度距离
	 * 
	 * @param lon1
	 *            第一点的精度
	 * @param lat1
	 *            第一点的纬度
	 * @param lon2
	 *            第二点的精度
	 * @param lat3
	 *            第二点的纬度
	 * @return 返回的距离，单位km
	 */
	double lon1 = 0.0f;
	double lat1 = 0.0f;
	double lon2 = 0.0f;
	double lat2 = 0.0f;
	// 赤道半径(单位m)
	private static final double EARTH_RADIUS = 6378137;

	/**
	 * 转化为弧度(rad)
	 */
	private static double rad(double d) {
		return d * Math.PI / 180.0;
	}

	/**
	 * 基于余弦定理求两经纬度距离
	 * 
	 * @param lon1
	 *            第一点的精度
	 * @param lat1
	 *            第一点的纬度
	 * @param lon2
	 *            第二点的精度
	 * @param lat2
	 *            第二点的纬度
	 * @return 返回的距离，单位km
	 */
	public static double LantitudeLongitudeDist(double lon1, double lat1, double lon2, double lat2) {
		double radLat1 = rad(lat1);
		double radLat2 = rad(lat2);

		double radLon1 = rad(lon1);
		double radLon2 = rad(lon2);

		if (radLat1 < 0)
			radLat1 = Math.PI / 2 + Math.abs(radLat1);// south
		if (radLat1 > 0)
			radLat1 = Math.PI / 2 - Math.abs(radLat1);// north
		if (radLon1 < 0)
			radLon1 = Math.PI * 2 - Math.abs(radLon1);// west
		if (radLat2 < 0)
			radLat2 = Math.PI / 2 + Math.abs(radLat2);// south
		if (radLat2 > 0)
			radLat2 = Math.PI / 2 - Math.abs(radLat2);// north
		if (radLon2 < 0)
			radLon2 = Math.PI * 2 - Math.abs(radLon2);// west
		double x1 = EARTH_RADIUS * Math.cos(radLon1) * Math.sin(radLat1);
		double y1 = EARTH_RADIUS * Math.sin(radLon1) * Math.sin(radLat1);
		double z1 = EARTH_RADIUS * Math.cos(radLat1);

		double x2 = EARTH_RADIUS * Math.cos(radLon2) * Math.sin(radLat2);
		double y2 = EARTH_RADIUS * Math.sin(radLon2) * Math.sin(radLat2);
		double z2 = EARTH_RADIUS * Math.cos(radLat2);

		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
		// 余弦定理求夹角
		double theta = Math.acos((EARTH_RADIUS * EARTH_RADIUS + EARTH_RADIUS * EARTH_RADIUS - d * d)
				/ (2 * EARTH_RADIUS * EARTH_RADIUS));
		double dist = theta * EARTH_RADIUS;
		return dist;
	}

	/**
	 *
	 * 文件名：ServerReceive 实现功能：作为服务器接收客户端发送的文件
	 *
	 * 具体实现过程： 1、建立SocketServer，等待客户端的连接 2、当有客户端连接的时候，按照双方的约定，这时要读取一行数据
	 * 其中保存客户端要发送的文件名和文件大小信息 3、根据文件名在本地创建文件，并建立好流通信 4、循环接收数据包，将数据包写入文件
	 * 5、当接收数据的长度等于提前文件发过来的文件长度，即表示文件接收完毕，关闭文件 6、文件接收工作结束
	 * @param path
	 *            保存视频的目录
	 * 端口号：4044           
	 */
	public static void ServerReceive(String path)throws IOException  {
		
		/**
		 * 与服务器建立连接的通信句柄
		 */
		ServerSocket ss = null;
		Socket s = null;

		/** 定义用于在接收后在本地创建的文件对象和文件输出流对象 */
		File file = null;
		FileOutputStream fos = null;

		/** 定义输入流，使用socket的inputStream对数据包进行输入 */
		InputStream is = null;

		/** 定义byte数组来作为数据包的存储数据包 */
		byte[] buffer = new byte[4096 * 5];

		/** 用来接收文件发送请求的字符串 */
		String comm = null;

		/** 建立socekt通信，等待服务器进行连接 */
		try {
			ss = new ServerSocket(4044);
			s = ss.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/** 读取一行客户端发送过来的约定信息 */
		try {
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			comm = br.readLine();
		} catch (IOException e) {
			System.out.println("服务器与客户端断开连接");
		}

		/** 开始解析客户端发送过来的请求命令 */
		int index = comm.indexOf("/#");

		/** 判断协议是否为发送文件的协议 */
		String xieyi = comm.substring(0, index);
		if (!xieyi.equals("111")) {
			System.out.println("服务器收到的协议码不正确");
			return;
		}

		/** 解析出文件的名字和大小 */
		comm = comm.substring(index + 2);
		index = comm.indexOf("/#");
		String filename = comm.substring(0, index).trim();
		String filesize = comm.substring(index + 2).trim();

		/** 创建空文件，用来进行接收文件 */
		file = new File(path+"/"+filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("服务器端创建文件失败");
			}
		} else {
			/** 在此也可以询问是否覆盖 */
			System.out.println("本路径已存在相同文件，进行覆盖");
		}

		/** 【以上就是客户端代码中写到的服务器的准备部分】 */

		/**
		 * 服务器接收文件的关键代码
		 */
		try {
			/** 将文件包装到文件输出流对象中 */
			fos = new FileOutputStream(file);
			long file_size = Long.parseLong(filesize);
			is = s.getInputStream();
			/** size为每次接收数据包的长度 */
			int size = 0;
			/** count用来记录已接收到文件的长度 */
			long count = 0;

			/** 使用while循环接收数据包 */
			while (count < file_size) {
				/** 从输入流中读取一个数据包 */
				size = is.read(buffer);

				/** 将刚刚读取的数据包写到本地文件中去 */
				fos.write(buffer, 0, size);
				fos.flush();

				/** 将已接收到文件的长度+size */
				count += size;
				System.out.println("服务器端接收到数据包，大小为" + size);
			}

		} catch (FileNotFoundException e) {
			System.out.println("服务器写文件失败");
		} catch (IOException e) {
			System.out.println("服务器：客户端断开连接");
		} finally {
			/**
			 * 将打开的文件关闭 如有需要，也可以在此关闭socket连接
			 */
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void	ServerSend(String filePath) throws IOException{
		int port = 6600;

//	   void start() {
//		 run(){
	        Socket s = null;
	        ServerSocket ss=null;
	        try {
	             ss = new ServerSocket(port);
//	            while (true) {
	                // 选择进行传输的文件

	                File fi = new File(filePath);

	                System.out.println("文件长度:" + (int) fi.length());

	                // public Socket accept() throws
	                // IOException侦听并接受到此套接字的连接。此方法在进行连接之前一直阻塞。

	                s = ss.accept();
	                System.out.println("建立socket链接");
	                DataInputStream dis = new DataInputStream(new BufferedInputStream(s.getInputStream()));
	                dis.readByte();

	                DataInputStream fis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
	                DataOutputStream ps = new DataOutputStream(s.getOutputStream());
	                //将文件名及长度传给客户端。这里要真正适用所有平台，例如中文名的处理，
									//还需要加工，具体可以参见Think In Java 4th里有现成的代码。
	                ps.writeUTF(fi.getName());
	                ps.flush();
	                ps.writeLong((long) fi.length());
	                ps.flush();

	                int bufferSize = 8192;
	                byte[] buf = new byte[bufferSize];

	                while (true) {
	                    int read = 0;
	                    if (fis != null) {
	                        read = fis.read(buf);
	                    }
	                    if (read == -1) {
	                        break;
	                    }
	                    ps.write(buf, 0, read);
	                }
	                ps.flush();
	                // 注意关闭socket链接哦，不然客户端会等待server的数据过来，
	                // 直到socket超时，导致数据不完整。                
	                fis.close();
	                s.close();
	                System.out.println("文件传输完成");
	                
//	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

//	}
}
