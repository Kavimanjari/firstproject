package project;
import java.util.*;
public class atm {
public static void main(String args[]) {
	int pin=1234;
	int balance=10000;
	int addamount=0;
	int takeamount=0;
	String name;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter your pin number:");
	int password=scanner.nextInt();
	
	
	if(password==pin) { 
		System.out.println("Enter your name:");
		name=scanner.next();
		System.out.println("WELCOME "  +name);
		while(true) {
			System.out.println("press 1 to Check your balance");
			System.out.println("press 2 to Add amount");
			System.out.println("press 3 to Take amount");
			System.out.println("press 4 to Get recipt");
			System.out.println("press 5 to Get exit");
			int opt = scanner.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Your current balance:" +balance);
				break;
			case 2:
				System.out.println("Enter the amount to be added:");
				addamount=scanner.nextInt();
				System.out.println("Successfully credited");
				balance=balance+addamount;
				break;
			case 3:
				System.out.println("enter the amount to be debited:");
				takeamount=scanner.nextInt();
				if(takeamount>balance) {
				System.out.println("Your balance is insuifficient");
				System.out.println("Enter amount according to your balance");
				
					
				}
				else {
					System.out.println("Successfully taken");
					balance=balance-takeamount;
				}
			
				break;
			case 4:
				System.out.println("WELCOME TO KL ATM " +name);
				System.out.println("Your balance: " +balance);
				System.out.println("Amount Added:" +addamount);
				System.out.println("Amount Taken:" +takeamount);
				System.out.println("Thank you");
				break;
	
			}
			if(opt==5) {
				System.out.println("THANK YOU");
				break;
			}
		}
		
	}
	else {
		System.out.println("Wrong Pin Number");
	}
}
}
