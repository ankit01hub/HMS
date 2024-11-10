 package TestNG;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Properties;

import javax.security.auth.login.AccountNotFoundException;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

public class ReadConfig {
	
Properties pro;
String path="C:\\Selenium\\seleniumwebdriver\\src\\test\\java\\TestNG\\config.properties";
	public  ReadConfig() throws FileNotFoundException
	{	FileInputStream fis= new FileInputStream(path);
	try {
		pro.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  }
	 public String getURL()
	{	String  url  = pro.getProperty("url"); 
	return url;
	}
	
	public String getUsername()
	{String username=pro.getProperty("username");
	return username;
	}
	public String getPassword()
	{String password =pro.getProperty("password");
	return password;
	
	}
 

}











