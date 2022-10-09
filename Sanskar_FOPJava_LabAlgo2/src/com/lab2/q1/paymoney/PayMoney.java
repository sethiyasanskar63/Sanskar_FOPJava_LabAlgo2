package com.lab2.q1.paymoney;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array:");
		int size = sc.nextInt();

		System.out.println("Enter the values of array:");
		int[] transactionArr = new int[size];
		for (int i = 0; i < size; i++) {
			transactionArr[i] = sc.nextInt();
		}

		System.out.println("Enter the number of targets to be achieved:");
		int target = sc.nextInt();

		while (target > 0) {

			System.out.println("Enter the target value:");
			int targetValue = sc.nextInt();

			int sum = 0;
			boolean isAchieved = false;

			for (int i = 0; i < size; i++) {

				sum = sum + transactionArr[i];

				if (targetValue <= sum) {

					System.out.println("Target " + targetValue + " achieved after " + (i + 1) + " transactions");
					isAchieved = true;
					break;
				}
			}

			if (!isAchieved) {
				System.out.println("Given target not achieved.");
			}

			target--;
		}

		sc.close();

	}

}
