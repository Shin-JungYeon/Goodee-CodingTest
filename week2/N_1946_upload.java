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
				// ���� �迭�� ���� ����
				arr[j][0] = scan.nextInt(); // �����ɻ����
				arr[j][1] = scan.nextInt(); // �����������
				
			}
			
			// (8)
			Arrays.sort(arr, (o1, o2) -> {return o1[0] - o2[0];});
			
			/* �� �ڵ�� �Ʒ� �ڵ带 ���� �� ���� �����ϰ� ǥ���� ����Դϴ�. ������ ǥ�� ����� �˾Ƶӽô�~
			 * 0��° ���� �������� �����ϴ� �ڵ��Դϴ�!
			  	Arrays.sort(arr, new Comparator<int[]>() {
		            @Override
		            public int compare(int[] o1, int[] o2) {
		                return o1[0] - o2[0];
		                // �����ڼ� ������ �ϰ� �ʹٸ� o2�� o1�� ��ġ�� �ٲ��ݴϴ�
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



