package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 275 队花的烦恼一
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月16日 下午7:01:34
 */
public class TestShowBinary {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNextInt()) {
			int num = cin.nextInt();
			String str = "";
			while(num != 0) {
				if(num % 2 == 0) {
					str = 0 + str;
				}else {
					str = 1 + str;
				}
				num = num >> 1;
			}
			if(str.length() == 0) {
				str = "0";
			}
			System.out.println(str);
		}
	}
}