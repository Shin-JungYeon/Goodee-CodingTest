package week2;

import java.util.*;

public class N_1946_upload {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int caseN = scan.nextInt();			// (1)
		for(int i=0; i<caseN; i++) {		// (2)
			// (3)
			int cnt = 0;					// (4)
			int min = 999999;				// (5) 
			
			int n = scan.nextInt();			// (6)
			int[][] arr = new int[n][2];	// (7)
			
			for(int j=0; j<n; j++) {
				// 각각 배열에 순위 저장
				arr[j][0] = scan.nextInt(); // 서류심사순위
				arr[j][1] = scan.nextInt(); // 면접시험순위
				
			}
			
			// (8)
			Arrays.sort(arr, (o1, o2) -> {return o1[0] - o2[0];});
			
			/* 위 코드는 아래 코드를 조금 더 쉽고 간단하게 표시한 방식입니다. 간결한 표시 방식을 알아둡시다~
			 * 0번째 열을 기준으로 정렬하는 코드입니다!
			  	Arrays.sort(arr, new Comparator<int[]>() {
		            @Override
		            public int compare(int[] o1, int[] o2) {
		                return o1[0] - o2[0];
		                // 내림자순 정렬을 하고 싶다면 o2와 o1의 위치를 바꿔줍니다
		                // return o2[1] - o1[1];
		            }
	        	});
			 */
			
			for(int a=0; a<n; a++) {
				// (9)
				if(min > arr[a][1]) { 
					cnt++;
					min = arr[a][1];		// (10)
				}
			}
			System.out.println(cnt);
		}
	}
}



