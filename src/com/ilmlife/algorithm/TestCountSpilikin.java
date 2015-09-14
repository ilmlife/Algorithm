package com.ilmlife.algorithm;

import java.util.Scanner;


/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 360 数数小木块
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 创建时间：2015年9月13日 下午6:17:47
 */
public class TestCountSpilikin {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			int layers = cin.nextInt();
			int sum = 0;
			int loop = layers, layerNum = layers;
			while(loop -- > 0) {
				sum += layerNum * (layers - loop);
				layerNum --;
			}
			System.out.println(sum);
		}
	}
}
