package redington.week3.project;
import java.util.Scanner;
public class RangeReverse {
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
		for(i=end;i>=begin;i--)
		{
			System.out.println(i);
		}
	}

}
