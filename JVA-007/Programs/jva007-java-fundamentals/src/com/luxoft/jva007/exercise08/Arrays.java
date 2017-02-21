package com.luxoft.jva007.exercise08;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int [] array = new int[5];
		
		for (int i=0; i<5; i++) {
			array[i] = i+1;
		}

		System.out.println(array.length);
		//ArrayIndexOutOfBoundsException show this error
        //System.out.println(array[6]);

		System.out.println("Input the length of the array: ");
		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.next());

		//fillArr(num);
		outputArr(changeArr(fillArr(num)));
	}

	public static int[] changeArr(int[] arr){

		for (int i = 0; i < arr.length-1; i++){
			int k;
			k = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = k;
			i++;
		}

		return arr;
	}

	public static void outputArr(int[] arr){

		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}

	public static int[] fillArr(int n){
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = Integer.parseInt(scanner.next());
		}
		return arr;
	}

}
