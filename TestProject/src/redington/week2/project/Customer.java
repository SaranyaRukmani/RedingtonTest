package redington.week2.project;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bank bank=new Bank();
       bank.withdraw();
       bank.deposit();
       Bank.calculateInterset();
       System.out.println("Bank Name :"+Bank.name);
       }

}
