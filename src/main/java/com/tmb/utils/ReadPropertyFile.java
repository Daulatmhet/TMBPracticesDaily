package com.tmb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import Iconstants.FramworkConstants;

public final class ReadPropertyFile {
	
	
	
	//If you passing 100 value and reading 100 data passing
	
	private ReadPropertyFile()
	{
		
		
	}
	
	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();
	
	static {
		try {
		FileInputStream file = new FileInputStream(FramworkConstants.getConfigFilepath());
		property.load(file);
		
		for(Object key : property.keySet())
		{
			CONFIGMAP.put(String.valueOf(key),String.valueOf(property.get(key))).trim();
		}
		
//		for(Map.Entry<Object, Object>entry:property.entrySet())
//		{
//			CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
//		}
		
		
		//If You know Lambda Expression
		// so you can go this approch
	//	property.entrySet().forEach(entry ->CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
		
	}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e){
			
		}
		
		
	}
	
	public static String get(String key) throws Exception
	{
		if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key)))
		{
			throw new Exception("Property name" + key + "is not found. Please check config.properties");
		}
		return CONFIGMAP.get(key);
		
	}
}



//Two method fill compartable use those code

	
//	
//	public static String getValue(String key) throws Exception
//	{
//		
//		if(Objects.isNull(property.getProperty(key)) || Objects.isNull(key))
//		{
//			throw new Exception("Property name" + key + "is not found. Please check config.properties");
//		}
//		return property.getProperty(key);
//		
//		
//	}
//
//}
