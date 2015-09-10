package com.ilmlife.algorithm;

import java.util.Scanner;

// 还没改好
public class TestSillyBear {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();

		for (int i = 0; i < group; i++) {
			String word = cin.next();
			int min = 100, max = 0;
			for (int m = 0; m < word.length(); m++) {
				int perNum = 1;
				for (int n = m + 1; n < word.length(); n++) {
					if (word.charAt(m) == word.charAt(n)) {
						perNum = perNum + 1;
					}
				}
				max = max < perNum ? perNum : max;
				min = min > perNum ? perNum : min;
			}
			int num = max - min;
			if(num >= 2 && isPrime(num)) {
				System.out.println("Lucky Word");
				System.out.println(num);
			}else {
				System.out.println("No Answer");
				System.out.println(0);
			}
		}
	}

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		int loopNum = (int) Math.sqrt(number);
		for (int k = 2; k <= loopNum; k++) {
			if (number % k == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
