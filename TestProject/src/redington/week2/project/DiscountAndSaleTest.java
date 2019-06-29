package redington.week2.project;
import java.util.Scanner;
public class DiscountAndSaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DiscountAndSale a1=new DiscountAndSale();
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the product price ");
         a1.product_price = scan.nextDouble();
         System.out.println("Enter the discount rate ");
         a1.discount_rate = scan.nextDouble();
         a1.discount();
         a1.salePrice();
	}

}
