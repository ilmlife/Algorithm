package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 277 车牌号
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月16日 下午6:50:34
 */
public class TestCarNo {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int num = cin.nextInt();
			String earlier = null;
			while(num -- > 0) {
				if(earlier == null) {
					earlier = cin.next();
					continue;
				}
				
				String cur = cin.next();
				for (int i = 0; i < cur.length() && i < earlier.length(); i++) {
					if(cur.charAt(i) < earlier.charAt(i)) {
						earlier = cur;
						break;
					}else if(cur.charAt(i) > earlier.charAt(i)){
						break;
					}
				}
			}
			System.out.println(earlier);
		}
	}
}