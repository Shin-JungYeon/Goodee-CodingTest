package week2;

import java.util.*;

// �׸���(������ ������ ã�Ƽ� Ǯ��)
// [���� 1049��] ��Ÿ�� ����
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
		
		// ��Ű���� �����ϴ� ���
		int pack = ((n/6)+1) * PCarr[0];
		// �����θ� �����ϴ� ���
		int single = n * SCarr[0];
		// ��Ű�� + ������ �����ϴ� ���
		int ps = ((n/6) * PCarr[0]) + ((n%6) * SCarr[0]);
		
		// �� �� ����� ���� ���� �������� �����ϴ� ���
		System.out.println(Math.min(pack, Math.min(single, ps)));	
	}
}
