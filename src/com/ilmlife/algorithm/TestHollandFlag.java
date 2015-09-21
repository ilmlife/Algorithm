package com.ilmlife.algorithm;

import java.util.Scanner;


/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 268 荷兰国旗问题
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月17日 下午6:10:47
 */
public class TestHollandFlag {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			String line = cin.next();
			char []output = new char[line.length()];
			int rIndex = 0,bIndex = line.length() - 1;
			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == 'R') {
					output[rIndex ++] = 'R';
				}else if(line.charAt(i) == 'B') {
					output[bIndex --] = 'B';
				}
			}
			
			for (int i = 0; i < output.length; i++) {
				if(output[i] != 0) {
					System.out.print(output[i]);
				}else {
					System.out.print('W');
				}
			}
			System.out.println();
		}
	}
}
