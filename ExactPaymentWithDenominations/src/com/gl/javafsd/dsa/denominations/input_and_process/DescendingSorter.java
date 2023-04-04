package com.gl.javafsd.dsa.denominations.input_and_process;

public class DescendingSorter {

	// instance variable
	int [] denominationArray;

	//Constructor
	public DescendingSorter(int [] denominationArray) {

		this.denominationArray = denominationArray;
	}



	public int[] getDenominationArray() {
		return denominationArray;
	}



	public void setDenominationArray(int[] denominationArray) {
		this.denominationArray = denominationArray;
	}

	//Descending order sorting done 

	public static int[]  sort(int [] denominationArray) {

		int size = denominationArray.length;
		int temp = 0;
		for(int i = 0 ;i< size;i++ ){
			for(int j=1; j<(size -i); j++ ) {
				if(denominationArray[j-1]< denominationArray[j]) {
					//swap elements
					temp = denominationArray[j-1];
					denominationArray[j-1] = denominationArray[j];
					denominationArray[j] = temp;

				}

			}
		}
		return denominationArray;
	}


}
