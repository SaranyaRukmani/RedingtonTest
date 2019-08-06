package com.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryManagementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManagement db=new LibraryManagement();
		Scanner scan=new Scanner(System.in);
		Connection con;
	    Statement sts;
	    ResultSet rs;
	    int status;
		boolean b=true;
		while(b)
		{
			System.out.println("1.INSERT\n2.DISPLAY BASED DEPARTMENT\n3.DISPLAY BASED AUTHOR ");
			int choice=scan.nextInt();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gridb","root","");
		    sts=con.createStatement();
			switch(choice)
			{
			case 1:
			{
				System.out.println("INSERT DATA");
		    	  System.out.println("***********");
		    	  System.out.println("Enter serial number");
		    	  int SNo=scan.nextInt();
		    	  System.out.println("Enter Book name");
		    	  String book_name=scan.next();
		    	  System.out.println("Enter Book number");
		    	  int book_number=scan.nextInt();
		    	  System.out.println("Enter Author name");
		    	  String author_name=scan.next();
		    	  System.out.println("Enter Department");
		    	  String department=scan.next();
		    	  System.out.println("Enter Book Price");
		    	  int price=scan.nextInt();
		    	  System.out.println("Enter Book edition");
		    	  String edition=scan.next();
		    	  System.out.println("Enter Book Publication");
		    	  String publication=scan.next();
		    	  status=db.insertData(sts,SNo,book_name,book_number,author_name,department,price,edition,publication);
		    	 if(status!=-1)
		          {
		        	  System.out.println("Inserted successfully");
		          }
		          else
		          {
		        	  System.out.println("Inserted Failure");
		          }
		    	 break;
			}
			case 2:
			{
				 System.out.println("DISPLAY BASED ON DEPARTMENT");
		    	  System.out.println("***************************");
		    	  System.out.println("Enter Department name");
		    	  String dept=scan.next();
			   rs=db.displayBasedDepartment(sts,dept);
			   while(rs.next())
		    	  {
		    		  System.out.print(rs.getInt(1)+" ");
		    		  System.out.print(rs.getString(2)+" ");
		    		  System.out.print(rs.getInt(3)+" ");
		    		  System.out.print(rs.getString(4)+" ");
		    		  System.out.print(rs.getString(5)+" ");
		    		  System.out.print(rs.getInt(6)+" ");
		    		  System.out.print(rs.getInt(7)+" ");
		    		  System.out.println(rs.getString(8)+" ");


		    	  }
			   break;
			}  
			case 3:
			{
			System.out.println("DISPLAY BASED ON AUTHOR");
		    System.out.println("***************************");
			 System.out.println("Enter Author name");
		     String author=scan.next();
			rs=db.displayBasedAuthor(sts,author);
			  while(rs.next())
	    	  {
	    		  System.out.print(rs.getInt(1)+" ");
	    		  System.out.print(rs.getString(2)+" ");
	    		  System.out.print(rs.getInt(3)+" ");
	    		  System.out.print(rs.getString(4)+" ");
	    		  System.out.print(rs.getString(5)+" ");
	    		  System.out.print(rs.getInt(6)+" ");
	    		  System.out.print(rs.getInt(7)+" ");
	    		  System.out.println(rs.getString(8)+" ");


	    	  }
			break;
			}
			}
			System.out.println("Do you want to continue(y/n)");
			char ch=scan.next().charAt(0);
			if(ch=='n')
			{
				b=false;
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}

}
