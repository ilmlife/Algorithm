package com.ilmlife.algorithm;
import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 206 矩形的个数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年3月31日 下午7:30:13
 */
public class TestRectangleNum {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNext()) {
			int c = cin.nextInt();
			int k = cin.nextInt();
			
			System.out.println(1L*c*k*(c+1)*(k+1)/4);
		}
	}
}