package com.bridgelabz.algorithmPrograms;

import java.util.*;

public class BankCashCounter {
	Scanner sc = new Scanner(System.in);
	Queue<Integer> numbers = new LinkedList<Integer>();
	static int[] arr1 = new int[20];
	static int j = 0;

	public void bankCounter() {
		BankCashCounter obj = new BankCashCounter(); // create object
		System.out.println("Enter The Input 1] Deposite Money   2] Withdraw Money   3] BankClosed");
		int value = sc.nextInt();
		switch (value) {
		case (1):
			System.out.println("Enter The Amount of Deposite");
			int money = sc.nextInt();
			obj.withdraw_DepositeAmt(money);
			bankCounter();
			break;
		case (2):
			System.out.println("Enter The Amount of Withdraw");
			int money1 = sc.nextInt();
			obj.withdraw_DepositeAmt(-money1);
			bankCounter();
			break;
		case (3):
			System.out.println("Bank was Closed");
			obj.display();
			break;

		default:
			System.out.println("User Enter Invalid Input");
		}
	}

	public void withdraw_DepositeAmt(int amount) {
		arr1[j] = amount;
		j++;
	}

	/*
	 * Display method to initialize and print
	 */
	public void display() {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				numbers.add(arr1[i]);
			}
		}
		System.out.println(numbers);
	}

	public void balance() {
	}

	public static void main(String[] args) {
		BankCashCounter obj1 = new BankCashCounter();
		obj1.bankCounter();
	}
}
