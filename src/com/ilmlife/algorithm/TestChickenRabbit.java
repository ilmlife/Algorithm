package com.ilmlife.algorithm;

import java.util.Scanner;

public class TestChickenRabbit {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			
			int temp1 = (4 * n - m);
			int temp2 = (m - 2 * n);
			if(temp1 >= 0 && temp1 % 2 == 0 && temp2 >= 0 && temp2 % 2 == 0) {
				System.out.println((temp1 >> 1) + " " + (temp2 >> 1));
			}else {
				System.out.println("No answer");
			}
		}
	}
}
