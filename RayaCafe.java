package com.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RayaCafe {
	    Scanner scan=new Scanner(System.in);
	    ResultSet rs;
	    int status;
        public int insertFoodDetails(Statement sts,int SNo,String FoodItem,int Price,int Offer,double offerPrice) throws ClassNotFoundException,SQLException
        {
			    int status=sts.executeUpdate("INSERT INTO cafe_menu VALUES("+SNo+",'"+FoodItem+"',"+Price+","+Offer+","+offerPrice+")");
			    return status;
        }
        
        public ResultSet displayMenu(Statement sts) throws ClassNotFoundException,SQLException
        {
			    rs=sts.executeQuery("SELECT*FROM cafe_menu");
				return rs;
				
        }
        public int deleteFoodDetails(Statement sts,int n) throws ClassNotFoundException,SQLException
        {
			    status=sts.executeUpdate("DELETE FROM cafe_menu WHERE SNo="+n);
			    return status;			
         }
        public int updateFoodDetails(Statement sts,int sno, int price, int offer, int offPrice) throws ClassNotFoundException,SQLException
        {
        	 
			    status=sts.executeUpdate("UPDATE cafe_menu SET Price="+price+",Offer="+offer+",OfferPrice="+offPrice+" WHERE SNo="+sno);
			    return status;
         }
        public ResultSet offerItem(Statement sts) throws ClassNotFoundException,SQLException
        {
			    rs=sts.executeQuery("SELECT SNo,FoodItem,Price FROM cafe_menu WHERE Offer>0");
				return rs;
			
        }

		        
        
        
        
        
        
        
        
        
        
        
        
}
