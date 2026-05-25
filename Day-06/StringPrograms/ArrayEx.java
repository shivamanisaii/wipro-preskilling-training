package com.wpiro.Day_six;
import java.util.Scanner;

public class ArrayEx {
	    public int MaxOfArray(int[] arr) {
	        if (arr.length == 0) return 0;
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter size: ");
	    	int size=sc.nextInt();
		}
	}
