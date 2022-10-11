package com.glearning.lab02;

public class PayMoneyTransaction {
	
	static int size = 3;
	static int inputTransaction[] = new int[size];
	static int totalNumberOfTargets = 4;

	public static void main(String[] args) {
		System.out.println("started the program");
		int targetValue = 2;
		//int totalNumberOfTargets = 2;
		int initialValue = 0;
		
		
		inputTransaction[0] = 20;
		inputTransaction[1] = 12;
		inputTransaction[2] = 31;
		
		int result = reachedTarget(initialValue, targetValue);
		System.out.println("Result is "+ result);
	}
	
	private static int reachedTarget(int initialValue, int targetValue) {
		int index = 0;
	
	while (initialValue < targetValue && index < size) {
		
		if (initialValue == targetValue) {
			System.out.println("Target reached after "+ (index + 1) + "attempts");
			
			return index;
		}
		if (index >= totalNumberOfTargets) {
			System.out.println("could not meet target after the target count");
			break;
		}
		initialValue = initialValue + inputTransaction[index++];
	}
	if (initialValue > targetValue) {
		return index;
		}
	return -1;
	  
	}

}