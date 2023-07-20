package com.rakesh;

public class Program1 {
	public static void main(String[] args) {
		int[] a = { 2, 4, 7, 8, 9, 7, 3, 6, 5, 4, 3 };
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
