package redington.week2.project;
import java.util.Scanner;
public class DistanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance a1=new Distance();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 value :");
		a1.x1=scan.nextInt();
		System.out.println("Enter x2 value :");
		a1.x2=scan.nextInt();
		System.out.println("Enter y1 value :");
		a1.y1=scan.nextInt();
		System.out.println("Enter y2 value :");
		a1.y2=scan.nextInt();
		a1.findDistance();
	}

}
