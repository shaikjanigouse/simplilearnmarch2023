package mypackage;

import java.util.Scanner;

public class Matrixmult {
	public static void main(String[] args) {
		int[][] arr=new int[5][5];
		int[][] arr2=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array 1 elements");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter array of 2 elements");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j]=sc.nextInt();
				
			}
		}
		int c=0;
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				c=arr[i]*arr2[j];
				System.out.println("output"+c);
			}
		}
	}

}
