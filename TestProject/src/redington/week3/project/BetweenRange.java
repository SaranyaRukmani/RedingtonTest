package redington.week3.project;
import java.util.Scanner;
public class BetweenRange {
	int begin,end,i;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter begin value ");
		begin=scan.nextInt();
		System.out.println("Enter end value ");
		end=scan.nextInt();
	}
	void result()
	{
		for(i=begin;i<=end;i++)
		{
			System.out.println(i);
		}
	}

}
