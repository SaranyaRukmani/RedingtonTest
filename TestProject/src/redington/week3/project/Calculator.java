package redington.week3.project;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
        double number1,number2,sum,sub,mul,div,square,squareroot;
        void getInput()
        {
        	Scanner scan=new Scanner(System.in);
        	System.out.println("Enter number1 ");
        	number1=scan.nextFloat();
        	System.out.println("Enter number2 ");
        	number2=scan.nextFloat();
        }
        void sum()
        {
        	sum=number1+number2;
        	System.out.println("Sum is "+sum);
        }
        void sub()
        {
        	sub=number1-number2;
        	System.out.println("Subtraction is "+sub);
        }
        void mul()
        {
        	mul=number1*number2;
        	System.out.println("Multiplication is "+mul);
        }
        void div()
        {
            div=number1/number2;
            System.out.println("Division is "+div);
        }
        void squareroot()
        {
        	squareroot=Math.sqrt(number1*number2);
        	System.out.println("Square root of given numbers "+square);
        }
        void square()
        {
        	square=Math.pow(number1, 2);
        	System.out.println("Square of first number "+square);
        	square=Math.pow(number2, 2);
        	System.out.println("Square of second number "+square);
        }
        
}
