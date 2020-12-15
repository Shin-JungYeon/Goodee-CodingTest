package week2;

import java.util.*;

// 그리디(최적의 조건을 찾아서 풀기)
// [백준 1049번] 기타줄 문제
public class N_1049 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		int[] PCarr = new int[b];
		int[] SCarr = new int[b];
		
		for(int i=0;i<b;i++) {
			PCarr[i] = scan.nextInt();
			SCarr[i] = scan.nextInt();
		}
		Arrays.sort(PCarr);
		Arrays.sort(SCarr);
		
		// 패키지만 구매하는 경우
		int pack = ((n/6)+1) * PCarr[0];
		// 낱개로만 구매하는 경우
		int single = n * SCarr[0];
		// 패키지 + 낱개로 구매하는 경우
		int ps = ((n/6) * PCarr[0]) + ((n%6) * SCarr[0]);
		
		// 위 세 경우중 가장 적은 가격으로 구매하는 경우
		System.out.println(Math.min(pack, Math.min(single, ps)));	
	}
}
