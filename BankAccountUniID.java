package java_LJH_instance_example;

public class BankAccountUniID {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		yoon.initAccount("12-34-89", "990990-9090990", 10000);

		BankAccount park = new BankAccount();
		park.initAccount("33-55-09", "770088-5959007", 10000);

		yoon.deposit(5000);
		park.deposit(3000);

		yoon.withdraw(2000);
		park.withdraw(2000);

		yoon.checkMyBalance();
		park.checkMyBalance();  
	}
}
