package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 244 16进制的简单运算
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年3月30日 下午6:10:13
 */
public class Test16Cal {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			String s = cin.next();
			if(s.indexOf("+") > 0) {
				int a = Integer.parseInt(s.split("\\+")[0], 16);
				int b = Integer.parseInt(s.split("\\+")[1], 16);
				System.out.println(Integer.toOctalString(a + b));
			}else {
				int a = Integer.parseInt(s.split("\\-")[0], 16);
				int b = Integer.parseInt(s.split("\\-")[1], 16);
				System.out.println(Integer.toOctalString(a - b));
			}
		}
	}
}