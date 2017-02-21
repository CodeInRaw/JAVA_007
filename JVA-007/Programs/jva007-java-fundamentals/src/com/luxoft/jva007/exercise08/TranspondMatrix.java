package com.luxoft.jva007.exercise08;

import java.util.Scanner;

/**
 * Created by Ihor Ruskykh on 2/21/2017.
 */
public class TranspondMatrix {
    public static void main(String[] args){
        System.out.println("Input the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());

        //outputArr(fillArr(num));
        outputArr(transpondMatrix(fillArr(num)));

    }


    public static void outputArr(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] fillArr(int n){
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(scanner.next());
            }
        }
        return arr;
    }

    public static int[][] transpondMatrix(int[][] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        return arr;
    }
}
