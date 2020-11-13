package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {

 public static String BaseConfigvalue(String value) throws IOException{
	 
	 String filepath = "./Config.properties";
	 FileInputStream fis = new FileInputStream(filepath);
	
	 Properties pro = new Properties();
     pro.load(fis);

     System.out.println(pro.getProperty(value));
     //System.out.println(pro.getProperty("Email"));
     //System.out.println(pro.getProperty("Pass"));
    return pro.getProperty(value);
    
     
     
     
	}
			
}
