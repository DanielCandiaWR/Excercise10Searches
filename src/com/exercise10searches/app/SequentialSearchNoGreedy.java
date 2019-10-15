package com.exercise10searches.app;
import java.util.*;
public class SequentialSearchNoGreedy {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 10;
		
		byte userNumber = 0;
		int counter=0;
		boolean isInArray = false;
		
		int[] mainArray = new int[ARRAY_SIZE];
		
		Scanner scan = new Scanner(System.in);
		Random randomNumbers = new Random(System.nanoTime());
		//Fill the array with pseudo random numbers
		for(int i=0; i<ARRAY_SIZE;i++) {
			mainArray[i] = randomNumbers.nextInt(101);
			System.out.print(mainArray[i]+" ");
		}
		//Validate positive values
		do {
			System.out.print("\nInput a number to search: ");
			userNumber = (byte) scan.nextInt();
			if(userNumber<0) {
				System.out.println("Your number must be higher than or equal to zero!");
			}
		}while(userNumber<0);
		//Search of the input number
		for(int i=0; i<ARRAY_SIZE;i++) {
			if(mainArray[i]==userNumber) {
				System.out.println("Your number "+userNumber+" is in the position: "+i);
				isInArray=false;
				break;
			}else {
				isInArray=true;
			}
		}
		if(isInArray) {
			System.out.println("Your number isn't in the Array, sorry! :c");
			isInArray=false;
		}
		
		while(!isInArray && counter<ARRAY_SIZE) {
			if(mainArray[counter]==userNumber) {
				System.out.println("Your number "+userNumber+" is in the position: "+counter);
				isInArray=true;
			}else {
				isInArray=false;
				counter++;
			}
		}
		if(!isInArray) {
			System.out.println("Your number isn't in the Array, sorry! :c");
			isInArray=false;
		}
		//Destroy the object
		scan.close();
	}
}
