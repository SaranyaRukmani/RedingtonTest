package redington.week2.project;
import java.util.Scanner;
public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Triangle a1=new Triangle();
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter the base value of triangle ");
         a1.base=scan.nextInt();
         System.out.println("Enter the hight value of triangle ");
         a1.hight=scan.nextInt();
         a1.area();
	}

}
