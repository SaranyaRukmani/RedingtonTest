package redington.week3.project;
import java.util.Scanner;
public class Concatenate {
	String name1,name2;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string1 ");
		name1=scan.next();
		System.out.println("Enter string2 ");
		name2=scan.next();
	}
	void result()
	{
		System.out.println(name1+name2);
	}

}
