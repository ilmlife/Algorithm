package com.ilmlife.algorithm;

import java.util.Scanner;


public class TestShowOneInBinary {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int num = cin.nextInt();
			int times = 0;
			while(num > 0) {
				if(num % 2 == 1) {
					times += 1;
				}
				num = num >> 1;
			}
			System.out.println(times);
		}
	}
}