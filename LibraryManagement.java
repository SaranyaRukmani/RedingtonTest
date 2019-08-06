package com.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryManagement {
	 
	  Scanner scan=new Scanner(System.in);
      public int insertData(Statement st,int SNo,String book_name,int book_number,String author_name,String department,int price,String edition,String publication) throws SQLException
      {
    	   return st.executeUpdate("INSERT INTO library_master VALUES("+SNo+",'"+book_name+"',"+book_number+",'"+author_name+"','"+department+"',"+price+",'"+edition+"','"+publication+"')");
      
       	  
      }
      public ResultSet displayBasedDepartment(Statement st,String dept) throws SQLException
      {
    	 
    	  return st.executeQuery("SELECT * FROM library_master WHERE department='"+dept+"'");
    	 
    	
      }
      public ResultSet displayBasedAuthor(Statement st,String author) throws SQLException
      {
    	  
    	  return  st.executeQuery("SELECT * FROM library_master WHERE author_name='"+author+"'");
    	
    	
      }
}
