package redington.week3.project;
import java.lang.Math;
import java.util.Scanner;
public class SquareAndCube {
	double number,square,cube;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		number=scan.nextInt();
	}
	void square()
	{
		square=Math.pow(number, 2);
		System.out.println("Square of given number is "+square);
	}
	void cube()
	{
		cube=Math.pow(number, 3);
		System.out.println("Cube of given number is "+cube);
	}

}
