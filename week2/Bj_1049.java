package week2;

import java.util.*;

/*
 * 그리디 알고리즘
 * 
 * 백준_1049_기타줄_OK
 */

/*
 * 문제 요약
 * 	: 기타줄 6개가 들어있는 패키지의 가격, 낱개로 살 때의 가격이 주어질 때
 *    적어도 N개를 사기 위해 필요한 돈의 수를 최소로 하는 프로그램 작성하기.
 */

/*
 * 문제 접근
 * 	- 결국 우리가 알고싶은 것은 최소 지불 가격이기 때문에 입력값을 배열에 저장한 후 정렬하여 최저가를 찾아내거나, 애초에 입력을 받을 때 패키지 가격과 낱개 가격 중 최저가를 저장.
 * 	- 그 후 아래 세 가지 경우의 가격을 계산한 후 그 중 최저가를 출력.
 * 	- 패키지로만 구매하는 경우
 * 	- 낱개로만 구매하는 경우
 * 	- 패키지 + 낱개로 구매하는 경우
 * 	- 이 문제에서 꼭 한 가지의 브랜드만 사용해야 한다거나, 브랜드를 중복하면 안된다거나 하는 제약조건이 없었기 때문에 그냥 최저가를 찾으면 됨.
 */
public class Bj_1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] packArr = new int[M];
		int[] unitArr = new int[M];
		for(int i=0; i<M; i++) {
			packArr[i] = sc.nextInt();  // 6개 패키지 가격
			unitArr[i] = sc.nextInt();  // 낱개 가격
		}

		Arrays.sort(packArr); // Arrays 클래스가 제공하는 sort 메서드를 사용하면 배열의 원소들을 오름차순으로 정렬해줍니다. 
		Arrays.sort(unitArr);

//		Integer[] arr = new Integer[10];
//		Arrays.sort(arr, Collections.reverseOrder());  // 내림차순으로 정렬하고 싶을 땐 이렇게 코드를 작성하면 되지만 이 떄 들어가는 배열은 int[] 가 아닌 Integer[] 로 선언되어야 합니다!
		
		int minPC = packArr[0];  // 오름차순으로 정렬했기 때문에 가장 첫 번째 원소가 최저가.
		int minUC = unitArr[0];
		
		int packCost = (N/6 + 1) * minPC;  // 패키지로만 구매할 때의 가격. 6개가 되지 않아도 패키지로는 한 개가 필요하기 때문에 6으로 나눈 몫에 +1 을 해줍니다.
		int unitCost = N * minUC;  // 낱개로만 구매할 때의 가격.
		int packUnitCost = ((N/6) * minPC) + ((N%6) * minUC);  // 패키지 + 낱개로 구매할 때의 가격. 6개로 나눠지는 만큼은 패키지로 구매하고, 나머지는 낱개로 구매하는 경우입니다.
		
		// min 메서드로는 두 개의 숫자만 비교할 수 있기 때문에 하나의 수 대신 min 메서드를 한 번 더 써서 간결하게 코드를 구현할 수 있습니다.
		int minCost = Math.min(packCost, Math.min(unitCost, packUnitCost));
		
		System.out.println(minCost);
	}
	
}
