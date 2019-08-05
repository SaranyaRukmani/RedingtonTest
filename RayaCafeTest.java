package com.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RayaCafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RayaCafe db = new RayaCafe();
		Connection con;
		Statement sts;
		ResultSet rs;
		int status;
		Scanner scan = new Scanner(System.in);
		boolean s = true;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raya_db","root","");
		    sts=con.createStatement();
			while(s)
			{
			  System.out.println("1.INSERT\n2.DELETE\n3.UPDATE\n4.DISPLAY\n5.OFFER ITEM");
			  System.out.println("SELECT anyone");
		      int select = scan.nextInt();
			switch (select) {
			case 1: {
				System.out.println("INSERT Today FoodItems");
				System.out.println("**********************");
				System.out.println("Enter serial number");
	        	int SNo=scan.nextInt();
	        	System.out.println("Enter foodItem name");
	        	String FoodItem=scan.next();
	        	System.out.println("Enter price ");
	        	int Price=scan.nextInt();
	        	System.out.println("Enter Offer");
	        	int Offer=scan.nextInt();
	        	double OfferPrice=Price-Offer;

				status=db.insertFoodDetails(sts,SNo,FoodItem,Price,Offer,OfferPrice);
				if(status!=-1)
			    {
			    	System.out.println("Insertion success");
			    }
			    else
			    {
			    	System.out.println("Insertion failure");
			    }
				break;
			}
			case 2: {
				System.out.println("DELETE FOODITEMS");
				System.out.println("****************");
				 System.out.println("Enter serial number");
	        	 int n=scan.nextInt();
				 status=db.deleteFoodDetails(sts,n);
				   if(status!=-1)
				    {
				    	System.out.println("Deletion success");
				    }
				    else
				    {
				    	System.out.println("Deletion failure");
				    }

				break;
			}
			case 3: {
				   System.out.println("Enter SerialNumber");
	        	    int Sno=scan.nextInt();
	        	    System.out.println("Enter Price");
	        	    int Price=scan.nextInt();
	        	    System.out.println("Enter Offer");
	        	    int offer=scan.nextInt();
	        	    int offPrice=Price-offer;
				status=db.updateFoodDetails(sts, Sno,Price,offer,offPrice);
				if(status!=-1)
			    {
			    	System.out.println("Update success");
			    }
			    else
			    {
			    	System.out.println("Upadate failure");
			    }
				break;
			}
			case 4: {
				System.out.println("-----------RaYa CAFE MENU-----------");
				rs=db.displayMenu(sts);
				while(rs.next())
				{
					System.out.print(rs.getInt(1)+" ");
					System.out.print(rs.getString(2)+" ");
					System.out.print(rs.getInt(3)+" ");
					System.out.print(rs.getInt(4)+" ");
					System.out.println(rs.getDouble(5)+" ");
				}
			
				break;
			}
			case 5:
			{
				System.out.println("Offered Items");
				rs=db.offerItem(sts);
				while(rs.next())
				{
					System.out.print(rs.getInt(1)+" ");
					System.out.print(rs.getString(2)+" ");
					System.out.println(rs.getInt(3)+" ");
				}
				break;
			}
			}
			System.out.println("If you want to continue(y/n)");
			char ch=scan.next().charAt(0);
			if(ch=='n')
			{
				s=false;
			}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
