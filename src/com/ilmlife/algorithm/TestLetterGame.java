package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 273 字母小游戏
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月3日 下午19:07:58
 */
public class TestLetterGame {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			String str = cin.next();
			int num = 0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
					num ++;
				}
			}
			num = num % 26;
			System.out.println(num == 0 ? 'z' : (char)(num + 96));
		}
 	}
}