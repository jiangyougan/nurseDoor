package com.chance.ssm.utils;

import javax.servlet.http.HttpServletRequest;

public class SavePic {
	/**
	 * 单张图片路径添加
	 * 
	 * @param request
	 * 
	 * @param id
	 *            用户id
	 * 
	 * @param Imgpath
	 *            车辆照片/驾驶证照片/行驶证
	 * 
	 * @return
	 * 
	 * @throws Exception
	 */
	public String oneImgPathAdd(HttpServletRequest request,String userId, String filename,
			String Imgpath) throws Exception {
		String cut = "";
		String pathPicture = request.getSession().getServletContext()
				.getRealPath("");
		LzhUtils.createFolder(pathPicture + "/NurseImg"+"/" +filename);
		String newPicturePath = pathPicture + "/" + "NurseImg" + "/" +filename+"/" +userId
				+ RandomUtil.generateNumber2() + ".jpg";
		LzhUtils.base64Decode(Imgpath, newPicturePath);
		cut = newPicturePath.substring(newPicturePath.indexOf("nurseDoor"));
		return cut;
	}

	/**
	 * 多张图片路径添加
	 * 
	 * @param request
	 * @param id
	 * @param Imgpath
	 *            图片路径 图片格式为xxx.jpg,xxx.jpg,xxx.jpg
	 * @return
	 * @throws Exception
	 */
	public String manyImgPathAdd(HttpServletRequest request, String userId,String filename,
			String Imgpath) throws Exception {
		String cutnew = "";
		String cut = "";
		String pathPicture = request.getSession().getServletContext()
				.getRealPath("");
		LzhUtils.createFolder(pathPicture + "/NurseImg"+"/" +filename);
		String[] covers = Imgpath.split(",");
		String urlList = new String();
		for (int i = 0; i < covers.length; i++) {
			String newPicturePath = pathPicture + "/" + "NurseImg"+"/"+filename + "/" + userId
					+ RandomUtil.generateNumber2() + ".jpg";
			LzhUtils.base64Decode(covers[i], newPicturePath);
			if (i < 999) {
				urlList = newPicturePath;
			} else {
				urlList = urlList + "," + newPicturePath;
			}
			cut = urlList.substring(urlList.indexOf("nurseDoor")) + "," + cut;
		}
		cut.split(",");
		cutnew = cut.substring(0, cut.length() - 1);
		return cutnew;
	}


}
