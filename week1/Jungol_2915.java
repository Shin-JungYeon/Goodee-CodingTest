package week1;

import java.util.*;

/*
 * 정올_2915_동전 게임
 */
public class Jungol_2915 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int C = sc.nextInt();
		int[][] score = new int[C][C];
		for(int i=0; i<C; i++) {
			score[i][0] = sc.nextInt();
			score[i][1] = sc.nextInt();
		}
	}
}
