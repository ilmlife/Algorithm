package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 276 比较字母大小
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月16日 下午6:38:34
 */
public class TestCompareChar {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			char a = cin.next().charAt(0);
			char b = cin.next().charAt(0);
			
			if(a > b) {
				System.out.println(a + "<" + b);
			}else if(a < b) {
				System.out.println(a + ">" + b);
			}else {
				System.out.println(a + "=" + b);
			}
		}
	}
}