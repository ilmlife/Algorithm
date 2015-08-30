package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 56 阶乘因式分解（一）
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午3:36:25
 */
public class TestJcysfj {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int group = cin.nextInt();
		
		for (int i = 0; i < group; i++) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			
			int judgeNum = m, totalM = 0;
			while(judgeNum <= n) {
				int num = getTotalM(judgeNum, m, 0);
				if(num >= 1) {
					judgeNum += m;
					totalM += num;
				}else {
					judgeNum += 1;
				}
			}
			System.out.println(totalM);
		}
	}
	
	public static int getTotalM(int judgeNum,int m,int mNum) {
		if(judgeNum % m == 0) {
			mNum += 1;
			judgeNum = judgeNum / m;
			return getTotalM(judgeNum, m, mNum);
		}else {
			return mNum;
		}
	}
}
