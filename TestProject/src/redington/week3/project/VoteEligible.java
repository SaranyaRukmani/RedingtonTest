package redington.week3.project;
import java.util.Scanner;
public class VoteEligible {
	String name,gender;
	int age;
	void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Name of the candidate: ");
		name=scan.next();
		System.out.print("Gender: ");
		gender=scan.next();
		System.out.print("Age: ");
		age=scan.nextInt();
	}
	void result()
	{
		if(age>=18)
		{
			System.out.println(name+" is eligible to vote");
		}
		else
		{
			System.out.println(name+"is not eligible to vote");
		}
	}

}
