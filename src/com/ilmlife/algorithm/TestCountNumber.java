package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 198 数数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年3月30日 下午6:15:13
 */
public class TestCountNumber {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int num = cin.nextInt();
			while(num > 0) {
				int m = num % 10;
				switch (m) {
					case 0: System.out.print("O");break;
					case 1: System.out.print("O");break;
					case 2: System.out.print("T");break;
					case 3: System.out.print("T");break;
					case 4: System.out.print("F");break;
					case 5: System.out.print("F");break;
					case 6: System.out.print("S");break;
					case 7: System.out.print("S");break;
					case 8: System.out.print("E");break;
					case 9: System.out.print("N");break;
					default:;break;
				}
				num = num / 10;
			}
			System.out.println();
		}
	}
}
