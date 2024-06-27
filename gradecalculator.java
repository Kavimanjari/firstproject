package grade_calculator;
import java.util.*;

public class results {
	public static void main(String []args) {
	int marks;
    String name;
    
    int maxmark=100;
    Scanner s = new Scanner(System.in);
    System.out.println("ENTER YOUR NAME:");
    name=s.next();
    System.out.println("ENTER THE TOTAL NUMBER OF SUBJECTS:");
    int n=s.nextInt();
    
    int totalMarks = 0;
    int maxMark = 100;
    
     for(int i=1;i<=n;i++) {
    	 System.out.println("ENTER THE MARK OF SUBJECT" + i + "(OUT OF 100):");
    	 marks= s.nextInt();
     
    	 if(marks<0||marks>maxmark) {
    	 System.out.println("enter a valid mark...mark should be between 0 to 100");
    	 i--;
    	 }
    	 else {
    		  totalMarks  += marks;
    	 }}
    	double averagePercentage = (double)totalMarks / n;
    	System.out.println("EXAM RESULT");
    	 
    	System.out.println("TOTAL MARKS:" + totalMarks);
    	System.out.println("AVERAGE PERCENTAGE:" +averagePercentage);
    	if(averagePercentage >= 90) {
    		System.out.println("GRADE 'A'");
    	}
    	else if(averagePercentage >= 80) {
    		System.out.println("GRADE 'B'");
    		
    	}
    	else if(averagePercentage >= 70) {
    		System.out.println("GRADE 'C'");
    		
    	}
    	else if(averagePercentage >= 60) {
    		System.out.println("GRADE 'D'");
    		
    	}
    	else if(averagePercentage >= 50) {
    		System.out.println("GRADE 'E'");
    		
    	}
    	else {
    		System.out.println("GRADE 'F'");
    	}
    	 }
     }

