package com.gl.javafsd.dsa.denominations.test;

import java.util.List;

import com.gl.javafsd.dsa.denominations.DenominationInstancePair;
import com.gl.javafsd.dsa.denominations.input_and_process.ExactPayPossibleOrNot;
import com.gl.javafsd.dsa.denominations.output.Result;

public class ExactPayPossibleOrNotTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		testCase(new int[] {126, 20, 10, 2}, 158);
//		testCase(new int[] {58, 40, 25, 12, 5}, 128);
//		testCase(new int[] {120, 15, 8, 5}, 160);
//		testCase(new int[] {10, 5, 1}, 15);
//		testCase(new int[] {100}, 100);
		
//		testCase(new int[] {100}, 101);
		
		

	}
	
	static void testCase(int[] denominations, int paymentAmount) {
			
		ExactPayPossibleOrNot calculator = new ExactPayPossibleOrNot(denominations,paymentAmount);
		
		Result result = calculator.calculate();
	
		boolean exactPaymentAchieved = result.isExactPaymentAchievedOrNot();
		if (exactPaymentAchieved) {
		
			System.out.println("Exact Payment is Achieved");
			
			List<DenominationInstancePair> list = result.getDenominationInstanceList();
		
			for (DenominationInstancePair pair : list) {
				
				int denominationValue = pair.getDenominationValue();
				int noOfInstances = pair.getNoOfInstances();
				
				System.out.println("Denomination Value is " + denominationValue + ", Number of Instance(s) " + noOfInstances );
			}
		}else {
			System.out.println("Exact payment can not be achieved.");
		}
	}

}
