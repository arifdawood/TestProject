package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseTesting {
/*
	@Test
	public void DataBase() {
		public Connection con;
		public Statement stmt;
		
		public Statement getStatement() {
			try {
				// Driver to connect with the database
				String driver = "com.mysql.cj.jdbc.Driver";
				// Connection String to connect the database
				String connection = "jdbc:mysql:localhost:3306/customer";
				
				// UserName and Password for the database
				String userName = "root";
				String password = "password";
				// Register the driver
				Class.forName(driver);
				// connecting the database through DriverManager
				con = DriverManager.getConnection(connection, userName, password);
				// create the statment to write the sql query
				stmt = con.createStatement();
				return stmt;
			} catch (Exception e) {
		
			}
		}
	}
	
	@Test
	public void selectDBdata() {
		String query = "Select * from registration";
		DataBase dataBase = new DataBase();
		ResultSet data = dataBase.getData(query);
		System.out.println(data);
		while(data.next()) {
			System.out.println(data.getString(1) + " " + data.getString(2));
		}
	}
	
	*/
}
