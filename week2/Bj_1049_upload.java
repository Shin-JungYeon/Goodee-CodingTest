package week2;

import java.util.*;

public class Bj_1049_upload {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] packArr = new int[M];
		int[] unitArr = new int[M];
		for(int i=0; i<M; i++) {
			packArr[i] = sc.nextInt();			// 6개 패키지 가격
			unitArr[i] = sc.nextInt();			// 낱개 가격
		}

		Arrays.sort(packArr);					// (1)
		Arrays.sort(unitArr);

		// (1-2)
//		Integer[] arr = new Integer[10];
//		Arrays.sort(arr, Collections.reverseOrder());
		
		int minPC = packArr[0];					// (2)
		int minUC = unitArr[0];
		
		int packCost = (N/6 + 1) * minPC;		// (3)
		int unitCost = N * minUC;				// (4)
		int packUnitCost = ((N/6) * minPC) + ((N%6) * minUC);	// (5)
		
		int minCost = Math.min(packCost, Math.min(unitCost, packUnitCost));	// (6)
		
		System.out.println(minCost);
	}
}



