package com.chance.ssm.utils;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

/**
 * 
 * @author God
 * 
 * 
 *         Json工具
 */
public class GsonUtil {
	/**
	 * 将字符串通过转义变成‘进行生成json数据
	 * 
	 * 再通过转义变成“进行javaBean的反射
	 */
	private static String key = "\"";
	private static String reValue = "'";

	/**
	 * 将Object转化成json
	 * 
	 * @param value
	 * @return
	 */
	public static String createJsonString(final Object value) {
		Gson gson = GsonBuilderUtil.create();
		String str = gson.toJson(value);
		String newstr = str.replaceAll(key, reValue);
		return newstr;
	}

	/**
	 * 将Json数据转化为javaBean
	 * 
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> T getObject(String jsonString, Class<T> cls) {
		String newstr = jsonString.replaceAll(reValue, key);
		T t = null;
		try {
			Gson gson = GsonBuilderUtil.create();
			t = gson.fromJson(newstr, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	/**
	 * 将Json数据转化为javaBean
	 * 
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> T getObjectNormal(String jsonString, Class<T> cls) {
		T t = null;
		try {
			Gson gson = GsonBuilderUtil.create();
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	/**
	 * 将一个字符串转换成javaBean的集合
	 * 
	 * @param jsonString
	 * @param []cls
	 * @return
	 */
	public static <T> List<T> stringToArray(String s, Class<T[]> clazz) {
		T[] arr = GsonBuilderUtil.create().fromJson(s, clazz);
		return Arrays.asList(arr);
	}
}
