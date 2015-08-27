package com.ilmlife.algorithm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 1 A+B Problem
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年8月27日 下午11:19:47
 */
public class TestAPlusB {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = in.nextBigInteger();
		BigInteger b = in.nextBigInteger();
		System.out.println(a.add(b));
	}
}