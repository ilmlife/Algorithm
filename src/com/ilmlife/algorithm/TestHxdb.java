package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 34 韩信点兵
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestHxdb {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int _3 = cin.nextInt();
		int _5 = cin.nextInt();
		int _7 = cin.nextInt();
		
		boolean hasAnswer = false;
		for(int personalNum = 10; personalNum <= 100; personalNum ++) {
			if(personalNum % 3 == _3 && personalNum % 5 == _5 && personalNum % 7 == _7) {
				System.out.println(personalNum);
				hasAnswer = true;
				break;
			}
		}
		if(!hasAnswer) {
			System.out.println("No answer");
		}
	}
}