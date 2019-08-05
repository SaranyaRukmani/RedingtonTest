package com.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LibraryManagement {
	 
      public int insertData(Statement st,int SNo,String book_name,int book_number,String author_name,String department,int price,String edition,String publication) throws ClassNotFoundException,SQLException
      {
       	int status=st.executeUpdate("INSERT INTO library_master VALUES("+SNo+",'"+book_name+"',"+book_number+",'"+author_name+"','"+department+"',"+price+",'"+edition+"','"+publication+"')");
         return status;
       	  
      }
      ResultSet rs;
      public ResultSet displayBasedDepartment(Statement st,String dept) throws ClassNotFoundException,SQLException
      {
    	 
    	  rs=st.executeQuery("SELECT book_name,book_number,author_name,publication FROM library_master WHERE department='"+dept+"'");
    	  return rs;
    	
      }
      public ResultSet displayBasedAuthor(Statement st,String author) throws ClassNotFoundException,SQLException
      {
    	  
    	  rs=st.executeQuery("SELECT book_name,book_number,author_name,publication FROM library_master WHERE author_name='"+author+"'");
    	  return rs;
    	
      }
      public ResultSet displayBasedEdition(Statement st,int edition) throws ClassNotFoundException,SQLException
      {
    	  
    	  rs=st.executeQuery("SELECT book_name,book_number,author_name,publication FROM library_master WHERE edition="+edition+"");
    	  return rs;
    	
      }
}

