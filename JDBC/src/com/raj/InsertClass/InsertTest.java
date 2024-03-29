package com.raj.InsertClass;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;


public class InsertTest
{

	public static void main(String[] args)
	{
		try
		{
		Driver driver;
			driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/jdbc_intro"+"?user=root&password=root";
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected");
			Statement s = connection.createStatement();
			String sql = "Insert into Student(Rollno,Name,Sal)"+"values"+"('12','Rebel','43000')";
			s.execute(sql);
			s.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
