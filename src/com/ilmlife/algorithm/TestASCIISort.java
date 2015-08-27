package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 4 ASCII码排序
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestASCIISort {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		String result[] = new String[group];
		for (int i = 0; i < group; i++) {
			String str = cin.next();
			
			char []tmpChar = new char[str.length()];
			tmpChar[0] = str.charAt(0);
			for (int j = 1; j < str.length(); j++) {
				char now = str.charAt(j);
				int k = 0;
				for (;k < tmpChar.length && tmpChar[k] != 0; k++) {
					if(now < tmpChar[k]) {
						char temp = tmpChar[k];
						tmpChar[k] = now;
						now = temp;
					}
				}
				tmpChar[k] = now;
			}
			result[i] = String.valueOf(tmpChar);
		}
		
		for (int i = 0; i < result.length; i++) {
			String str = result[i];
			for (int j = 0; j < str.length(); j++) {
				System.out.print(str.charAt(j));
				if(j + 1 != str.length()) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}