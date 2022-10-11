package com.glearning.lab02;

public class CurrencyDenominator {
	
	static int[] sortedDenominators = {10, 50, 100, 20};
	static int targetAmount = 340;
	public static void main(String[] args) {
		
		int denominator = sortedDenominators[0];
		int numberOfNotes = targetAmount / denominator;
		
		System.out.println(numberOfNotes);
		
		targetAmount = targetAmount % denominator;
		
		System.out.println("Target amount :: "+ targetAmount);
		
		if (targetAmount < sortedDenominators[2]) {
			System.out.println("cannot use the denominators of the index");
		} else {
			denominator = sortedDenominators[2];
			numberOfNotes = targetAmount / denominator;
			
			System.out.println(numberOfNotes + " of denominator :: "+ denominator);
			
			targetAmount = targetAmount % denominator;
		}
	}
	

}
