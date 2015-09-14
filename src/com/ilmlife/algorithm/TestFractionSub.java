package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 111 份数加减
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月13日 下午6:11:47
 */
public class TestFractionSub {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int fz = 0, fm = 0;
		while (cin.hasNext()) {
			String line = cin.next();
			int a = line.charAt(0) - '0';
			int b = line.charAt(2) - '0';
			int c = line.charAt(4) - '0';
			int d = line.charAt(6) - '0';

			if(b != d) {
				fm = b * d;
				a = a * d;
				c = c * b;
			}else {
				fm = b;
			}
			
			int op = line.charAt(3);
			switch (op) {
				case '+':fz = a + c;break;
				case '-':fz = a - c;break;
			}
			
			if(fz == 0) {
				System.out.println(0);
			}else {
				boolean neg = fz < 0;
				
				fz = Math.abs(fz);
				int min = fz > fm ? fm : fz;
				for (int i = min; i > 1; i--) {
					if(fz % i == 0 && fm % i == 0) {
						fz = fz / i;
						fm = fm / i;
						break;
					}
				}
				
				if(neg) {
					System.out.print("-");
				}
				
				if(fm == 1) {
					System.out.println(fz);
				}else {
					System.out.println(fz + "/" + fm);
				}
			}
		}
	}
}