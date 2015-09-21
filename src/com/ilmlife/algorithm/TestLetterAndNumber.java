package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 217 a letter and a number
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月17日 下午6:15:47
 */
public class TestLetterAndNumber {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int letter = cin.next().charAt(0);
			if(letter >= 97) {
				letter = 96 - letter;
			}else {
				letter = letter - 64;
			}
			System.out.println(cin.nextInt() + letter);
		}
	}
}