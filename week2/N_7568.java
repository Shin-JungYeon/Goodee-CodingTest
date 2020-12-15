package week2;

import java.util.*;

// 브루트포스(모든 경우 다 해보기)  
// [백준 7568번] 덩치문제

/* 문제 요약
	: 사람 수 그리고 각각의 몸무게와 키를 받아와서 모든 사람과 비교했을 때 
	    몸무게와 키 모두 큰 경우에 더 높은 등수를 받는다. 
	    만약, 둘 중 하나만 큰 경우 등수는 그대로유지.
 */

/* 문제 접근
	- 모든 사람의 몸무게와 키를 배열에 저장한 후 이중 for문을 이용해서 모든 사람들과 비교
	- rank 변수 생성. 모든 사람 등수가 1등이라고 가정
	- 몸무게와 키 모두 작은 경우에는 rank 증가 후 출력
 */

public class N_7568 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 사람 수 받아오기
		int rank; // 등수를 저장할 변수
		int[][] arr = new int[n][2]; // 몸무게[0]와 키[1]를 저장할 배열 생성
		
		/* Q: 왜 배열로 만들어서 저장했나요?
		 * A: 몸무게와 키를 모든 사람과 비교하기 위해선 
		 *    배열에 저장 한 후, 모든 사람들과 비교해야겠다고 생각했습니다! 
		 */
		
		// 덩치 배열 만들기
		for(int i=0; i<n;i++) { // 사람 수 만큼 키와 몸무게 받아올 for문 생성
			arr[i][0] = scan.nextInt(); // 몸무게
			arr[i][1] = scan.nextInt(); // 키
		}
		
		// rank 정하기
		// 이중 for문을 이용해서 모든 사람과 비교
		for(int i=0; i<n; i++) {
			rank = 1; //우선 모든 사람을 1등이라고 가정 (등수는 초기화시켜서 사용!)
			// 등수를 초기화시키지 않으면 이전 등수에서 계속 누적되는 오류가 발생합니다~
			for(int j=0;j<n;j++) {
				// 몸무게와 키가 가장 작은사람들은 rank 값을 하나씩 증가시킨다.
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])	rank++; //rank[i]++;
			}
			System.out.print(rank+" ");
		}
	}
}
