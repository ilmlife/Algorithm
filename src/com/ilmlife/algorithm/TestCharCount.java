package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 260 数数小木块
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月14日 下午10:19:47
 */
public class TestCharCount {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			String line = cin.next();
			int preMaxTimes = 0,nowMaxTimes = 1;
			char preMax = 0, nowMax = 0;
			for (int m = 0; m < line.length(); m++) {
				nowMaxTimes = 1;
				nowMax = line.charAt(m);
				if(nowMax == preMax) {
					continue;
				}
				for (int n = m+1; n < line.length(); n++) {
					if(nowMax == line.charAt(n)) {
						nowMaxTimes ++;
					}
				}
				if(nowMaxTimes > preMaxTimes) {
					preMaxTimes = nowMaxTimes;
					preMax = nowMax;
				}else if(nowMaxTimes == preMaxTimes) {
					preMax = preMax > nowMax ? nowMax : preMax;
				}
			}
			System.out.println(preMax);
		}
	}
}
