package com.gl.javafsd.dsa.denominations.input_and_process;

import java.util.List;
import java.util.Scanner;

import com.gl.javafsd.dsa.denominations.DenominationInstancePair;
import com.gl.javafsd.dsa.denominations.output.Result;

public class DinominationsValue {

	//	Constructor of this class
	public DinominationsValue() {

	}

	public void process() {
		// taking values from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the Currency dinominations array ");	
		int denominationArraySize = input.nextInt();	
		int[] denominationArray = new int[denominationArraySize];

		System.out.println("Enter the currency dinomination value(s) ");	
		for (int index = 0; index < denominationArraySize; index ++) {

			denominationArray[index] = input.nextInt();
			input.nextLine();
		}	
		// Descending ordering 
		DescendingSorter sorter = new DescendingSorter(denominationArray);

		int [] resultDenominationArr = sorter.sort(denominationArray);
		//display the ordered array
		System.out.println("The Ordered Denominations are:");
		for(int i =0; i< resultDenominationArr.length; i++)
			System.out.print(resultDenominationArr[i]+ ", ");

		System.out.println();

		System.out.println("Enter the amount you want to pay");
		int exactAmount = input.nextInt();

		input.nextLine();

		ExactPayPossibleOrNot calculator = new ExactPayPossibleOrNot(resultDenominationArr,exactAmount);

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
