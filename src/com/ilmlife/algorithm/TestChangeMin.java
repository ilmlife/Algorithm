package com.ilmlife.algorithm;
import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 243 交换输出
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年3月30日 下午7:19:13
 */
public class TestChangeMin {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		do{
			int minIndex = 0;
			int num[] = new int[group];
			for (int i = 0; i < num.length; i++) {
				num[i] = cin.nextInt();
				if(num[minIndex] > num[i]) {
					minIndex = i;
				}
			}
			
			int first = num[0];
			num[0] = num[minIndex];
			num[minIndex] = first;
			
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			
			group = cin.nextInt();
		}while(group != 0);
	}
}