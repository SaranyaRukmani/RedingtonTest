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
			System.out.println("1.INSERT\n2.DISPLAY BASED DEPARTMENT\n3.DISPLAY BASED AUTHOR\n4.DISPLAY BASED EDITION\nChoose your option ");
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
		    	  String book_names=scan.next();
		    	  String book_name=book_names.toUpperCase();
		    	  System.out.println("Enter Book number");
		    	  int book_number=scan.nextInt();
		    	  System.out.println("Enter Author name");
		    	  String author_names=scan.next();
		    	  String author_name=author_names.toUpperCase();
		    	  System.out.println("Enter Department");
		    	  String Department=scan.next();
		    	  String department=Department.toUpperCase();
		    	  System.out.println("Enter Book Price");
		    	  int price=scan.nextInt();
		    	  System.out.println("Enter Book edition");
		    	  String edition=scan.next();
		    	  System.out.println("Enter Book Publication");
		    	  String Publication=scan.next();
		    	  String publication=Publication.toUpperCase();
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
		    	  String Dept=scan.next();
		    	  String dept=Dept.toUpperCase();
			   rs=db.displayBasedDepartment(sts,dept);
			   System.out.println(" Book Name\tBook Number\tAuthor Name\tPublication");
			   System.out.println("*********\t***********\t***********\t***********");			   while(rs.next())
		    	  {
		    		  System.out.print(rs.getString(1)+"\t\t");
		    		  System.out.print(rs.getInt(2)+"\t\t");
		    		  System.out.print(rs.getString(3)+"\t\t");
		    		  System.out.println(rs.getString(4));
		    	  }
			   break;
			}  
			case 3:
			{
			System.out.println("DISPLAY BASED ON AUTHOR");
		    System.out.println("***************************");
			System.out.println("Enter Author name");
		    String Author=scan.next();
		    String author=Author.toUpperCase();
			rs=db.displayBasedAuthor(sts,author);
			System.out.println  (" Book Name\tBook Number\tAuthor Name\tPublication");
			   System.out.println("*********\t***********\t***********\t***********");
			  while(rs.next())
			  {
	    		  System.out.print(rs.getString(1)+"\t\t");
	    		  System.out.print(rs.getInt(2)+"\t\t");
	    		  System.out.print(rs.getString(3)+"\t\t");
	    		  System.out.println(rs.getString(4));
	    	  }
			break;
			}
			case 4:
			{
			System.out.println("DISPLAY BASED ON EDITION");
		    System.out.println("***************************");
			System.out.println("Enter Edition");
		    int edition=scan.nextInt();
			rs=db.displayBasedEdition(sts,edition);
			  System.out.println(" Book Name\tBook Number\tAuthor Name\tPublication");
			   System.out.println("*********\t***********\t***********\t***********");
			  while(rs.next())
	    	  {
	    		  System.out.print(rs.getString(1)+"\t\t");
	    		  System.out.print(rs.getInt(2)+"\t\t");
	    		  System.out.print(rs.getString(3)+"\t\t");
	    		  System.out.println(rs.getString(4));
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
