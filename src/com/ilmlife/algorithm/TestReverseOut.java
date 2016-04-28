package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 266 字符串逆序输出
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月1日 下午19:07:58
 */
public class TestReverseOut {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		while(group -- > 0) {
			String str1 = cin.next();
			String str2 = cin.next();
			
			for (int i = str2.length() - 1; i >= 0; i--) {
				if(str2.charAt(i) >= 97 && str2.charAt(i) <= 122) {
					System.out.print(str2.charAt(i));
				}
			}
			for (int i = str1.length() - 1; i >= 0; i--) {
				if(str1.charAt(i) >= 97 && str1.charAt(i) <= 122) {
					System.out.print(str1.charAt(i));
				}
			}
			System.out.println();
		}
	}
}