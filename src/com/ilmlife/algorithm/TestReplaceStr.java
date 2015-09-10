package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 113 字符串替换
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月07日 下午7:46:13
 */
public class TestReplaceStr {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str = null;
		while(cin.hasNextLine()) {
			str = cin.nextLine();
			System.out.println(str.replaceAll("you", "we"));
		}
	}
}
