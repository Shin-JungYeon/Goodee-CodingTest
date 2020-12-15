package week3;

import java.util.*;

/*
 * 백준_2577_숫자의 개수_OK
 */
public class Bj_2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String ABC = (A*B*C) + "";
		int[] nums = new int[10];
		for(int i=0; i<ABC.length(); i++) {
			nums[ABC.charAt(i)-'0'] += 1;
		}
		for(int n : nums) System.out.println(n);
	}
}
