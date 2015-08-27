package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 2 括号配对问题
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestBracketMatch {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		int num = cin.nextInt();
		String result[] = new String[num];

		for (int times = 0; times < num; times++) {
			String str = cin.next();
			if (str != null && str.length() > 0 && str.length() % 2 == 0) {
				int stackIndex = 0;
				char stack[] = new char[str.length()];// 栈做匹配,可以处理,不需要这么大
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == '(' || str.charAt(i) == '[') {
						stack[stackIndex] = str.charAt(i);
						stackIndex++;
					} else if ((str.charAt(i) == ')' && stackIndex > 0 && stack[stackIndex - 1] == '(')
							|| (str.charAt(i) == ']' && stackIndex > 0 && stack[stackIndex - 1] == '[')) {
						stackIndex--;
					} else {
						result[times] = "No";
						break;
					}
				}

				if (result[times] == null) {
					result[times] = "Yes";
				}
			} else {
				result[times] = "No";
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}