package week1;

import java.util.*;

/*
 * �ڷᱸ�� - ����ť
 * ����_1214_������׷�
 */
public class Jungol_1214 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] stick = new int[n+2];
		Stack<Integer> stack = new Stack<Integer>();
		long area = 0;

		for(int i=1; i<=n; i++) {
			stick[i] = sc.nextInt();
		}
		stack.push(0);

		Deque<String> deque = new ArrayDeque<>();
		for(int i=1; i<=n+1; i++) {
			while (!stack.isEmpty() && stick[stack.peek()] > stick[i]) {  // stack�� ����� �ε����� ���� ���̺��� ���簡 ���� ���
				int height = stick[stack.peek()];  // ���̴� ��� ���� ���� ������ ����
				stack.pop();
				int width = i - stack.peek() - 1;

				area = Math.max(area, width * height);
			}
			stack.push(i);
		}

		System.out.println(area);
	}
}
