package com.raj.InsertClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class TestInsert4
{

	public static void main(String[] args) 
	{
		Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
			
			FileInputStream fis = new FileInputStream("mydbinfo.properties");
		
			Properties properties = new Properties();
			properties.load(fis);
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
