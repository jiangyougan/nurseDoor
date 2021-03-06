package com.chance.ssm.utils;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class DateSerializer implements JsonSerializer<Date> {

	public JsonElement serialize(Date src, Type arg1,
			JsonSerializationContext arg2) {
		return new JsonPrimitive(src.getTime());
	}
}