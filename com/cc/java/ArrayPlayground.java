package com.cc.java;


public class ArrayPlayground {

	static int [] numArr = {2,4,6,7,20};
	// static String strArr = {"Ich", "bin", "Maxine", "Mützerich"};

    public static void main(String[] args) {

		// System.out.ptintln(numArr);

		outputArr();

		numArr[0] = 100;
		

		System.err.println("Elemente:" + numArr.length);
		// numArr[3] = 101;
		numArr[numArr.length-1] = 101;


		outputArr();
	}


	static void outputArr(){



		System.out.println("---------------------------------------");
		System.out.print(numArr[0] + ",");
		System.out.print(numArr[1] + ",");
		System.out.print(numArr[2] + ",");
		System.out.print(numArr[3] + ",");
		System.out.println(numArr[4] + ",");
		System.out.println("---------------------------------------");

	}
	}