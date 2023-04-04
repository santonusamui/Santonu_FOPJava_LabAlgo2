package com.gl.javafsd.dsa.denominations.input_and_process;

import com.gl.javafsd.dsa.denominations.DenominationInstancePair;
import com.gl.javafsd.dsa.denominations.output.Result;

public class ExactPayPossibleOrNot {

	//	Instance Variables of this class
	private int[] denominations;
	private int paymentAmount;
	private Result result;

	//	Constructor of this class
	public ExactPayPossibleOrNot(int[] denominations, int paymentAmount) {

		this.denominations = denominations;
		this.paymentAmount = paymentAmount;	

		this.result = new Result();
	}

	public Result calculate() {

		// [12 / 4]  here 12 is dividend , 4 is  divisor
		int denominationIndex = 0;

		int dividend = paymentAmount;

		//		initially it is set to false
		result.setExactPaymentAchievedOrNot(false);

		while (denominationIndex < denominations.length) {

			int divisor = denominations[denominationIndex];

			//	Division operation is done to find out the number of instance(s) for a particular denomination
			//	and also to check whether a particular denomination can be given for a successful payment or not.
			int quotient = dividend / divisor;

			//	Modulo-Division is done to find out the remaining Balance after a successful instance(s) finding
			//	and also responsible to find out the result for the Exit Condition
			int remainder = dividend % divisor;

			//we can view the Dividend and divisor at each iteration

			//System.out.println("Dividend, Divisor " + dividend + ", " + divisor);			

			if (quotient != 0) {

				// Consider the denomination as part of the overall result

				// [12 / 4]  here 12 is dividend , 4 is  divisor

				DenominationInstancePair pair = new DenominationInstancePair(divisor, quotient);

				result.getDenominationInstanceList().add(pair);


				dividend = remainder;
			}

			if (remainder == 0) {

				result.setExactPaymentAchievedOrNot(true);
				break;
			}


			denominationIndex ++;
		}		
		return result;
	}

}
