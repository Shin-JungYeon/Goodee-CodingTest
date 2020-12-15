package week2;

import java.util.*;

/*
 * ���Ʈ����
 * 
 * ����_1182_�κм����� ��
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
		if(sum == S && cnt >= 1) {  // 1�� �̻��� ���Ұ� �������� �� ���� S�� ���
			ans++;
		}
		subSum(idx + 1, sum + nums[idx], cnt + 1);  // ���� ���Ҹ� ���� ���
		subSum(idx + 1, sum, cnt);  // ���� ���Ҹ� ������ ���� ���
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
		subSum(0, 0, 0);  // �ε���, �κ� ���� ��, �κ� ���� ����
		System.out.println(ans);
	}
}
