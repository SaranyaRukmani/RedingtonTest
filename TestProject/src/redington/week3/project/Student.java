package redington.week3.project;
import java.util.Scanner;
public class Student {
	String name,interest;
	int rollNo;
    void getInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Name: ");
    	name=scan.next();
    	System.out.print("RollNo: ");
    	rollNo=scan.nextInt();
    	System.out.print("Fields of Interest: ");
    	interest=scan.next();
    }
    void result()
    {
    	System.out.println("Hey,my name is "+name+" and my roll number is "+rollNo+".My fields of interest are "+interest);
    }
}
