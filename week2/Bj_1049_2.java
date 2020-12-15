package week2;

import java.util.*;

/*
 * �׸��� �˰���
 * 
 * ����_1049_��Ÿ��_OK
 */
public class Bj_1049_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int minPC = 1000;  // �������� ������ 0���� ũ�ų� ����, 1000���� �۰ų� ���� ������� �߱� ������ ũ�� �� �� �ּڰ��� �������ֱ� ���ؼ��� �־��� ������ �ִ񰪺��� ũ�ų� ���� �ʱ�ȭ ���־�� �մϴ�.
		int minUC = 1000;
		for(int i=0; i<M; i++) {
			minPC = Math.min(sc.nextInt(), minPC);  // 6�� ��Ű�� ����
			minUC = Math.min(sc.nextInt(), minUC);  // ���� ����

// Math Ŭ������ min �޼��� ������� �ʰ� ���� ���ؼ� �������� ã�Ƴ��� ����Դϴ�.
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
