package redington.week2.project;
import java.util.Scanner;
public class Table {
	int a,number,n,i;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter multiplier");
		number=scan.nextInt();
		System.out.println("Enter n value");
		n=scan.nextInt();
	}
	void result()
	{
		for(i=1;i<=n;i++)
		{
			a=i*number;
			System.out.println(i+"*"+number+"="+a);
		}
	}

}
