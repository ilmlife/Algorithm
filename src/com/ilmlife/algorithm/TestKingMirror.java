package com.ilmlife.algorithm;
import java.util.Scanner;

/**
 * http://acm.nyist.net/JudgeOnline/problemset.php
 * 264 国王的魔镜
 * 
 * @author ilmlife E-Mail：ilmlife@126.com
 * @version 1.0 创建时间：2016年3月31日 下午7:19:13
 */
public class TestKingMirror {
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		int group = cin.nextInt();
		while(group -- > 0) {
			String str = cin.next();
			boolean km = true;
			while(km && str.length() % 2 == 0) {
				int calNum = str.length() / 2;
				for (int i = 0; i < calNum; i++) {
					if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
						km = false;
						break;
					}
				}
				if(km) {
					str = str.substring(0, calNum);
				}
			}
			System.out.println(str.length());
		}
	}
}