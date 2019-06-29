package redington.week3.project;
import java.util.Scanner;
public class SumAndAverage {
	float number1,number2,number3,sum,average,i;
	void getIput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		number1=scan.nextFloat();
		number2=scan.nextFloat();
		number3=scan.nextFloat();
		
	}
	void sum()
	{
		sum=number1+number2+number3;
		System.out.println("Sum of 3 numbers "+sum);
	}
	void average()
	{
		average=(number1+number2+number2+number3)/3;
		System.out.println("Average of 3 numbers "+average);
	}

}
