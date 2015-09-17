package com.ilmlife.algorithm;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 458 小光棍数
 * 
 * <p>同余定理 即 a三b mod m  则存在一个k使得a=b+k*m(数学渣,不懂,记着)</p>
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月16日 下午8:50:34
 */
public class TestSmallSingleNumber {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			BigDecimal bigM = cin.nextBigDecimal();
			System.out.println(bigM.subtract(BigDecimal.ONE).multiply(new BigDecimal(1000)).add(new BigDecimal(471)));
		}
	}
}