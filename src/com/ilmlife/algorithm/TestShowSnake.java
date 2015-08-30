package com.ilmlife.algorithm;

import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 33 蛇形填数
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2015年8月30日 下午5:03:52
 */
public class TestShowSnake {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		
		int[][] array = new int[n][n];
		int hIndex = 0, zIndex = n -1, value = 1;
		int max = n * n, direction = 2;
		while(true) {
			array[hIndex][zIndex] = value;
			switch (direction) {
				case 1:{// 上
					if(hIndex == 0 || array[hIndex - 1][zIndex] != 0) {
						direction = 4;
						zIndex ++;
					}else {
						hIndex --;
					}
				}; break;
				case 2:{// 下
					if(hIndex + 1 == n || array[hIndex + 1][zIndex] != 0) {
						direction = 3;
						zIndex --;
					}else {
						hIndex ++;
					}
				}; break;
				case 3:{// 左
					if(zIndex == 0 || array[hIndex][zIndex - 1] != 0) {
						direction  = 1;
						hIndex --;
					}else {
						zIndex --;
					}
				}; break;
				case 4:{// 右
					if(zIndex + 1 == n || array[hIndex][zIndex + 1] != 0) {
						direction = 2;
						hIndex ++;
					}else {
						zIndex ++;
					}
				}; break;
			}
			
			if(value == max) {
				break;
			}
			value ++;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if(j + 1 != array[i].length) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
