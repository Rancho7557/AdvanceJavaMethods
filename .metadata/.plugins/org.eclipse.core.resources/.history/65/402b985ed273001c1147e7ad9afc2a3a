package jADVJ2EE;
import java.util.Scanner;

 abstract class Bank
 {
	 public String Name = "ICICIBank";
	 public String IFSC = "ICIC7557";
	 
	 public void bankDetails()
	 {
		 System.out.println("Bank_Name: "+ Name +"  "+ "Bank_IFSC code: " + IFSC);
	 }
	 abstract void Deposite();
	 abstract void Withdraw();
	 abstract void checkBal();
 }
 
 class bankService extends Bank
 {
	 private double bal = 5000;
	 private int pwd;
	 public double money;
	 
	 public void Deposite()
	 {
		 System.out.println("ICICI BANK PASSWORD PLEASE ENTER: ");
		 Scanner fg = new Scanner(System.in);
		 pwd = fg.nextInt();
	 
	 if(pwd == 7557107)
	 {
		System.out.println("Enter Your Deposite Amount:  ");
		money = fg.nextDouble();
		bal = bal + money;
		System.out.println("Deposite Amount:  "+ money);
		System.out.println("Total Amount:  "+ bal);
		
	 }
	 else
	 {
		 System.out.println("Your Are Entered Wrong Password...!");
	 }
	
	}
	 
	 public void Withdraw()
	 {
		 System.out.println("Enter Your Passsword:  ");
		 Scanner fg = new Scanner(System.in);
		 pwd = fg.nextInt();
		 
		 if(pwd == 7557107)
		 {
			System.out.println("Enter Your Widthdraw Amount:  ");
			money = fg.nextDouble();
			bal = bal + money;
			System.out.println("Widthdraw Amount:  "+ money);
			System.out.println("Total Amount:  "+ bal);
			
		 }
		 else
		 {
			 System.out.println("Your Are Entered Wrong Password...!");
		 }
	 }
	 
	 public void checkBal()
	 {
		 System.out.println("Enter Your Passsword:  ");
		 Scanner fg = new Scanner(System.in);
		 pwd = fg.nextInt();
		 
		 if(pwd == 7557107)
		 {
			System.out.println("Total Amount:  "+ bal);
			
		 }
		 else
		 {
			 System.out.println("Your Are Entered Wrong Password...!");
		 }
		 
	 }
 
 }
	 
public class Abstra {
	public static void main(String[] args) {
		 
		bankService b = new bankService();
		b.bankDetails();
		
		int ch;
		
		System.out.println("1. For Deposite:");
		System.out.println("2. for Withdraw:");
		System.out.println("3. for Check Your ICICI Balance: ");
		
		System.out.println("Enter Your Choice : ");
		 Scanner ug = new Scanner(System.in);
		 ch = ug.nextInt();
		 switch(ch)
		 {
		 case 1: b.Deposite();
		 break;
		 case 2: b.Withdraw();
		 break;
		 case 3: b.checkBal();
		 break;
		 default: System.out.println("Invalid Choice...!"); 
		 }
		
	}

}
