package redington.week3.project;
import java.util.Scanner;
public class OddSeries {
       int i,n;
       void getInput()
       {
    	   Scanner scan=new Scanner(System.in);
    	   System.out.println("Enter n value");
    	   n=scan.nextInt();
       }
       void result()
       {
    	   for(i=1;i<=n;i++)
    	   {
    		   if(i%2!=0)
    		   {
    			   System.out.println(i);
    		   }
    	   }
       }
}
