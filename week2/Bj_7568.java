package week2;

import java.util.*;

public class Bj_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] wehe = new int[N][2];
		int[] rank = new int[N];
		
		for(int i=0; i<N; i++) {
			wehe[i][0] = sc.nextInt();
			wehe[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i == j) continue;  // 자신과는 비교하지 않음.
				if((wehe[i][0] < wehe[j][0]) && (wehe[i][1] < wehe[j][1])) {
					rank[i] += 1;  // i보다 j가 덩치가 크면 i보다 큰 사람의 수를 늘려줌.
				}
			}
			System.out.print((i!=N-1)?((rank[i]+1) + " "):(rank[i]+1));
		}
	}
}


