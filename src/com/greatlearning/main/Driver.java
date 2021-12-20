package com.greatlearning.main;
import java.util.Scanner;

public class Driver {
	public static void main(String []args) {
		
		//Creating object of class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Getting the inputs from user
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter the values of array");
		
		//Loop to initialize the transaction array
		for(int i=0;i<size;i++) {
		array[i] = sc.nextInt();	
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int no_of_targets= sc.nextInt();
		
		//Loop to check the target value for the number of times the user wants to check
		for(int k = 0;k<no_of_targets;k++) {
			
			//Getting the target value from user
			System.out.println("Enter the value of target");
			int value_target= sc.nextInt();
			
			//Declaring check variables
			int target_check = 0;
			int counter_check = 0;
		//Loop to check the target value
		for(int j=0;j<size;j++) {
			
			//Incrementing the counter
			counter_check = counter_check+1;
			
			//Adding the value in the transaction array
			target_check = target_check+ array[j];
			
			//Checking the if the target value is achieved
			if(target_check>=value_target) {
				break;
			}
		}
		
		//Printing the resultant output to user
		if(target_check>=value_target) {
			System.out.println("Target achieved after "+ counter_check +" no of transactions");
			}
		else {
			System.out.println("Target not achieved");	
		}
		
		}

	}

}
