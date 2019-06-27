package redington.week2.project;
import java.lang.Math; 
public class Distance {
	int x1,x2,y1,y2;
	double d,firstpart,secondpart;
	void findDistance()
	{
		firstpart=(x2-x1)*(x2-x1);
		secondpart=(y2-y1)*(y2-y1);
		d=Math.sqrt(firstpart*secondpart);
		System.out.println("Distance between two points : "+d);
	}

}
