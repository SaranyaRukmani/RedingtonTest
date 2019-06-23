package redington.week2.project;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculator calc=new Calculator();
       calc.add();
       calc.sub();
       calc.div();
       calc.mul();
	}
	void add()
	{
		int a=10,b=80,total;
		total=a+b;
		System.out.println("Addition is "+total);
	}
	void sub()
	{
		int a=80,b=10,total;
		total=a-b;
		System.out.println("Subtraction is "+total);
	}
	void div()
	{
		int a=80,b=10,total;
		total=a/b;
		System.out.println("Division is "+total);
	}

	void mul()
	{
		int a=80,b=10,total;
		total=a*b;
		System.out.println("Multiplication is "+total);
	}
}
