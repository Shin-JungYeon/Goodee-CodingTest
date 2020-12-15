package week2;

import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();			// (1)
		int rank;						// (2)
		int[][] arr = new int[n][2];	// (3)
		
		// 덩치 배열 만들기
		for(int i=0; i<n;i++) {
			arr[i][0] = scan.nextInt(); // 몸무게
			arr[i][1] = scan.nextInt(); // 키
		}
		
		// (4)
		for(int i=0; i<n; i++) {
			rank = 1;					// (5)
			for(int j=0;j<n;j++) {
				// (6)
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])	rank++; //rank[i]++;
			}
			System.out.print(rank+" ");
		}
	}
}


