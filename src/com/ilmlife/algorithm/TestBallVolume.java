package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 242 计算球体积
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年4月1日 下午19:07:58
 */
public class TestBallVolume {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(cin.hasNext()) {
			double r = cin.nextDouble();
			System.out.println((int)Math.rint(4*3.1415926*r*r*r/3));
		}
	}
}