package week1;

import java.util.*;

/*
 * 자료구조 - 스택큐
 * 정올_1214_히스토그램
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
			while (!stack.isEmpty() && stick[stack.peek()] > stick[i]) {  // stack에 저장된 인덱스의 막대 높이보다 현재가 작은 경우
				int height = stick[stack.peek()];  // 높이는 계속 가장 높은 막대의 높이
				stack.pop();
				int width = i - stack.peek() - 1;

				area = Math.max(area, width * height);
			}
			stack.push(i);
		}

		System.out.println(area);
	}
}
