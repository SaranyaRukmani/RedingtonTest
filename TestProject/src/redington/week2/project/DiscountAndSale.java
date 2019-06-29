package redington.week2.project;

public class DiscountAndSale {
	double discount_amount,product_price,discount_rate,sale_price;
	double discount()
	{
		discount_amount= product_price*discount_rate;
		System.out.println("Discount Amount of Product "+discount_amount);
		return discount_amount;
	}
	void salePrice()
	{
		sale_price=product_price-discount_amount;
		System.out.println("SalePrice of product "+sale_price);
	}

}
