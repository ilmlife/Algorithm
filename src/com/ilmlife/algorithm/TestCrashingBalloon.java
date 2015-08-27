package com.ilmlife.algorithm;

/**
 * (分数低的挑战)如果按照分数计算： <br/>
 * 1.两者没有矛盾,分高的胜利<br/> 
 * 2.两者怎么都会有矛盾,其中一人说假话,那么说真话的那个赢<br/>
 * 3.两者怎么都会有矛盾,且两人都说假话,则分高的赢<br/>
 **/
public class TestCrashingBalloon {
	static boolean flagA;
	static boolean flagB;

	public static void main(String[] args) {
		int winner = 0;
		int maxScore = 333333333, minScore = 81;

		if (maxScore < minScore) {
			int temp = maxScore;
			maxScore = minScore;
			minScore = temp;
		}

		dfs(maxScore, minScore, 1);
		winner = maxScore;
		if(!flagA && flagB) {
			winner = minScore;
		}
		
		System.out.println(winner);
	}

	public static void dfs(int m, int n, int kk) {
		int k = kk;
		if (m == 1 && n == 1) {// 在两个数的所有各不相同的因子中，有因子能重新乘出给出的两个数，则A说了真话
			flagA = true; // A说了真话
			return;
		}
		if (n == 1) {// 在两个数的所有各不相同的因子中，没有任何因子能重新乘出给出的两个数，则B说了真话
			flagB = true; // B说了真话
		}
		while ((k < m || k < n) && (k < 100)) {
			k++;
			/*
			 * 依次找出两个数所有各不相同的因子，如24和12的所有因子为 2，3，4，6，8，12 ，
			 * 再在这些因子中搜索，看是否能重新乘出给出的两个数
			 */
			if (m % k == 0) {
				dfs(m / k, n, k);
				if (flagA) {
					return;
				}
			}
			if (n % k == 0) {
				dfs(m, n / k, k);
				if (flagA) {
					return;
				}
			}
		}
	}
}
