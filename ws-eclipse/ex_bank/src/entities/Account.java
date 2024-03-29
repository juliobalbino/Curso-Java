package entities;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	public static final double TAX = 5.00;
	
	public Account() {}
	
	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account " + getNumber() + ", Holder: " + getName() + ", Balance: $ " + getBalance();
	}
	
	public double depositValue(double value) {
		return  balance+= value;
	}
	
	public double withdrawValue(double value) {
		return balance-= value + TAX;
	}
	
}
