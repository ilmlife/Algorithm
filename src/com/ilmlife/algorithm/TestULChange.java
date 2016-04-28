package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 457 大小写互换
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月3日 下午19:07:58
 */
public class TestULChange {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			String str = cin.next();
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) < 97) {
					System.out.print((char)(str.charAt(i) + 32));
				}else {
					System.out.print((char)(str.charAt(i) - 32));
				}
			}
			System.out.println();
		}
 	}
}