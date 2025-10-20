package com.sjcet.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB = "jdbc:mysql://localhost:3306/student";
		final String USER = "admin";
		final String PWD = "sjcet123";
		
		Connection con = null;
		PreparedStatement ps = null;
		try{
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(DB, USER,PWD);
			System.out.println("Enter the word to search");
			String word = sc.next();
			ps = con.prepareStatement("select meaning from dictionary where word=?");
			ps.setString(1, word);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String meaning = rs.getString("meaning");
				System.out.println("The meaning of the word "+word+ " is: "+meaning);
			}
			else {
	    	System.out.println("Word " + word+ "Not found");
	    	}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
