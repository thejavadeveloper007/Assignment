package com.rakesh;

public class Program1 {
	public static void main(String[] args) {
		/*
		 * Assignment 1 1. Write a program to print INEURON using pattern programming
		 * logic.
		 */

		int n = 10;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == (n - 1) / 2 || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0) || (i == n / 2) || (i == n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j <= (3 * n) / 4) || (j == (3 * n) / 4 && i < n / 2)
						|| (i == n / 2 && j <= (3 * n) / 4) || (i - j == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.print("  ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();

		}
	}

}
