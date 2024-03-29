package com.raj.InsertClass;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class TestInsert3{

	public static void main(String[] args)
	{
		try 
		{
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/jdbc_intro"+"?user=root&password=root";
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected");
			Statement s = connection.createStatement();
			String sql = "Insert into Student(Rollno,Name,Sal)"+"values"+"('105','Raji',700000)";
			//int res = s.executeUpdate(sql);
			s.execute(sql);
			s.close();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
