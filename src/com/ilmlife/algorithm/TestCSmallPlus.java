package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 255 C小加 之 随机数
 *
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年9月15日 下午8:19:27
 */
public class TestCSmallPlus {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int n = cin.nextInt();
			int totalNum = n;
			int []array = new int[n];
			while(n -- > 0) {
				array[n] = cin.nextInt();
			}
			
			
			for (int i = 0; i < array.length; i++) {
				if(array[i] == 0) {
					continue;
				}
				for (int j = i + 1; j < array.length; j++) {
					if(array[j] == 0) {
						continue;
					}
					
					if(array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}else if(array[i] == array[j]) {
						array[j] = 0;
						totalNum --;
					}
				}
			}
			
			System.out.println(totalNum);
			for (int i = 0; i < array.length; i++) {
				if(array[i] != 0) {
					System.out.print(array[i] + " ");
				}
			}
		}
	}
}
