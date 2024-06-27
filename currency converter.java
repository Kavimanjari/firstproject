package currencyconverter;
import java.util.Scanner;

public class currencyconverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME!");
		System.out.println("1. USD to Rupee");
		System.out.println("2. Rupee to USD");
		System.out.println("3. Euro to Rupee");
		System.out.println("4. Rupee to Euro");
		System.out.println("Enter(1 or 2 or 3 or 4)");
		int value = scanner.nextInt();
		if(value==1) {
		    System.out.println("enter the amount in USD:");
	        double USD = scanner.nextDouble();
            double Rupee = USD * 83.47;
		    System.out.println("Amount in Rupee:"+Rupee);
			}
		else if(value==2) {
			System.out.println("enter the amount in Rupee");
		    double Rupee = scanner.nextDouble();
	        double USD = Rupee * 0.01197;
			System.out.println("Amount in USD:"+USD);

		    }
		else if(value==3) {
			System.out.println("enter the amount in Euro:");
		    double Euro = scanner.nextDouble();
	        double Rupee = Euro * 89.35;
			System.out.println("Amount in Rupee:"+Rupee);
			}
		else if(value==4) {
			System.out.println("enter the amount in Rupee:");
		    double Rupee = scanner.nextDouble();
	        double Euro = Rupee* 0.011;
			System.out.println("Amount in Euro :"+Euro);
			}
		else {
			System.out.println("Please enter valid Number(1 or 2 or 3 or 4):");
		}
		
		System.out.println("Thank you!");
		
	}

}
