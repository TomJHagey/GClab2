package labTwoGC;


	import java.util.Scanner;

	public class labTwo {
		
		public static void main(String [] args) {
			
			
			boolean run = true;
			while (run) {
		    
			  Scanner scnr = new Scanner(System.in); 
			  
			  System.out.println("Enter the length of the classroom (in inches), please: ");
			  
			  double length = 0;
		      length = scnr.nextDouble();
			  
			  System.out.println("Enter the width of the classroom (in inches), please: ");
			  
			  double width = 0;
			  width = scnr.nextDouble();
			  
			 double result = (length * width);
			 double result2 = (length + length + width + width);
			  
			  System.out.println("\n");
			  System.out.println("The area of the classroom is: " + result + " inches \n");
			  System.out.println("The perimeter of the cla ssroom is: " + result2 + " inches \n");
			  System.out.println("Would like to find the area and perimeter of a classroom again? (y/n)");
			  

			String userChoice1 = scnr.next();
		        if (userChoice1.equals("n"))
		            run = false;
		            
		      
			}
			
		    }

		    
		}
		    