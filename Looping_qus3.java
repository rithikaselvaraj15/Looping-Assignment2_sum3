//3.Menu-Driven Program

//Display a menu (Add, Sub, Exit).
//Execute at least once,
// repeat the menu until user selects Exit.



package com.index;

import java.util.Scanner;

public class Looping_qus3 {

	public static void main(String[] args) {
		

		
		 Scanner obj=new Scanner(System.in);
		
	        int choice;

	        for (;;) {   
	            System.out.println("\n1. Add");
	            System.out.println("2. Sub");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = obj.nextInt();

	            if (choice == 1) {
	                System.out.print("Enter two numbers: ");
	                int a = obj.nextInt();
	                int b = obj.nextInt();
	                System.out.println("Sum = " + (a + b));
	            }
	            else if (choice == 2) {
	                System.out.print("Enter two numbers: ");
	                int a = obj.nextInt();
	                int b = obj.nextInt();
	                System.out.println("Subtraction = " + (a - b));
	            }
	            else if (choice == 3) {
	                System.out.println("Program Exited");
	              
	}

}

	}
}

       
           
    

