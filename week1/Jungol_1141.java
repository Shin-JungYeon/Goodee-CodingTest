package week1;

import java.util.*;

/*
 * 자료구조 - 스택큐
 * 정올_1141_불쾌한 날
 * 
 * 6 5 2 4 2 6 1
 * --------------
 * 3+0+1+0+1+0=5
 */
public class Jungol_1141 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer> cow = new Stack<>();
		long rst = 0;
		for(int i=0; i<N; i++) {
			int hi = sc.nextInt();
			if(cow.isEmpty())	cow.push(hi);
			else {
				if(cow.peek() > hi) {
					cow.push(hi);
				} else {
					while(cow.peek() <= hi) {
						cow.pop();
						if(cow.isEmpty()) break;
					}
					cow.push(hi);
				}
			}
			rst += (cow.size()-1);
		}
		System.out.println(rst);
	}
}
