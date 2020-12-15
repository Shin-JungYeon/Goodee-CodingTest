package week2;

import java.util.*;

/*
 * 그리디 알고리즘
 * 
 * 백준_1049_기타줄_OK
 */
public class Bj_1049_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int minPC = 1000;  // 문제에서 가격은 0보다 크거나 같고, 1000보다 작거나 같은 정수라고 했기 때문에 크기 비교 후 최솟값를 저장해주기 위해서는 주어진 정보의 최댓값보다 크거나 같게 초기화 해주어야 합니다.
		int minUC = 1000;
		for(int i=0; i<M; i++) {
			minPC = Math.min(sc.nextInt(), minPC);  // 6개 패키지 가격
			minUC = Math.min(sc.nextInt(), minUC);  // 낱개 가격

// Math 클래스의 min 메서드 사용하지 않고 직접 비교해서 최저가를 찾아내는 방법입니다.
//			int pack = sc.nextInt();
//			int unit = sc.nextInt();
//			if(i == 0) {.
//				minPC = pack;
//				minUC = unit;
//			} else {
//				if(minPC > pack) minPC = pack;
//				if(minUC > unit) minUC = unit;
//			}
		}
		
		int packCost = (N/6 + 1) * minPC;
		int unitCost = N * minUC;
		int packUnitCost = ((N/6) * minPC) + ((N%6) * minUC);
		
		int minCost = Math.min(packCost, Math.min(unitCost, packUnitCost));
		
		System.out.println(minCost);
	}
}
