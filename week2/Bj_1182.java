package week2;

import java.util.*;

/*
 * 브루트포스
 * 
 * 백준_1182_부분수열의 합
 */
public class Bj_1182 {
	static int N;
	static int S;
	static int[] nums;
	static int ans;
	public static void subSum(int idx, int sum, int cnt) {
		if(idx >= N) {
			if(sum == S && cnt == nums.length) ans++;
			return;
		}
		if(sum == S && cnt >= 1) {  // 1개 이상의 원소가 더해졌을 때 합이 S인 경우
			ans++;
		}
		subSum(idx + 1, sum + nums[idx], cnt + 1);  // 현재 원소를 더한 경우
		subSum(idx + 1, sum, cnt);  // 현재 원소를 더하지 않은 경우
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		ans = 0;
		subSum(0, 0, 0);  // 인덱스, 부분 수열 합, 부분 수열 갯수
		System.out.println(ans);
	}
}
