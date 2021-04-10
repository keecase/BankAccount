package Assignment3;
//import javax.swing.JOptionPane;

public class BankAccount {
	//Declare all attributes  (variables) that are required for you class
	private int accountNumber; 
	private String firstName; 
	private String lastName;
	private String address; 
	private double accountBalance; 
	
	
	
	//Declare getters and setters (accessors and mutators) for each
	public int getAccountNumber()     {return this.accountNumber;}
	public String getFirstName()      {return this.firstName;}
	public String getLastName()       {return this.lastName;}
	public String getAddress()        {return this.address;}
	public double getAccountBalance() {return this.accountBalance;}

	
	public void setAccountNumber(int temp)     {this.accountNumber = temp;}
	public void setFirstName(String temp)      {this.firstName = temp;}
	public void setLastName(String temp)       {this.lastName = temp;} 
	public void setAddress(String temp)        {this.address = temp;}
	public void setAccountBalance(double temp) {this.accountBalance = temp;}
	

	//Declare a default constructor
	public BankAccount() {
		this.accountNumber = 2;
		this.firstName = "empty";
		this.lastName = "empty";
		this.address = "empty";
		this.accountBalance = 2; 
	}
	
	//Declare another constructor to set all attributes store when object is declared
	public BankAccount(int i1, String s2, String s3, String s4, double d5) {
		this.accountNumber = i1;
		this.firstName = s2;
		this.lastName = s3;
		this.address = s4;
		this.accountBalance = d5; 
	}
	
	//Declare another constructor that allows you to set string attributes and defaults numeric attributes to two
	public BankAccount(String s1, String s2, String s3) {
		this.accountNumber = 2;
		this.firstName = s1;
		this.lastName = s2;
		this.address = s3;
		this.accountBalance = 2; 
	}
	
	//Additional Functions
	public double withdrawAmount(double d1) {
		return this.accountBalance -= d1;
	}
	
	public double depositAmount(double d2) {
		return this.accountBalance += d2;
	}
	
	
	//Display Function 
	public void Display() {
		String msg = "Account Number: " + accountNumber + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + 
				     "\nAddress: " + address + "\nAccount Balance: " + accountBalance;
		System.out.println(msg);
	
	}
	
}
