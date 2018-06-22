package com.chance.ssm.utils;

import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * 
 * @author God
 * 
 *         创建时间 下午5:43:17
 * 
 *         专门为Gson转换时间类的工具
 */
public class DateDeserializer implements JsonDeserializer<java.util.Date> {

	public Date deserialize(JsonElement json, java.lang.reflect.Type arg1,
			JsonDeserializationContext arg2) throws JsonParseException {
		return new java.util.Date(json.getAsJsonPrimitive().getAsLong());
	}
}