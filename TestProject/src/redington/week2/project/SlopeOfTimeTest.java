package redington.week2.project;
import java.util.Scanner;
public class SlopeOfTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlopeOfTime obj = new SlopeOfTime();
        System.out.println("Enter x1 ");
        Scanner scan = new Scanner(System.in);
        obj.x1=scan.nextInt();
        System.out.println("Enter x2 ");
        obj.x2=scan.nextInt();
        System.out.println("Enter y1 ");
        obj.y1=scan.nextInt();
        System.out.println("Enter y2 ");
        obj.y2=scan.nextInt();
        obj.slope();
	}

}
