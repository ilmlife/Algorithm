package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 39 水仙花数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午6:26:26
 */
public class TestSxhs {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		int num = 0, b = 0, s = 0, g = 0;
		while((num = cin.nextInt()) != 0) {
			b = num / 100;
			s = (num % 100) / 10;
			g = num % 10; 
			
			if(b * b * b + g * g * g + s * s * s == num){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
