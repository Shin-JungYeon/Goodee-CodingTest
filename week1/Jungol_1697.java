package week1;

import java.util.*;

/*
 * 자료구조 - 큐
 * 정올_1967_큐
 * i n	큐에 저장
 * o	큐에서 뺌
 * c	큐 사이즈
 */
class QueueEx {
	int value;
	int size = -1;
	int rear = -1;
	QueueEx() {
		QueueEx[] q = new QueueEx[this.size];
	}
	void push(int value) {
		
	}
	int pop() {
		if(empty()) {
			return -1;
		}
		return 0;
	}
	int size() {
		if(empty()) {
			return 0;
		}
		return 0;
	}
	boolean empty() {
		return true;
	}
}
public class Jungol_1697 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt();
		QueueEx q = new QueueEx();
		for(int i=0; i<N; i++) {
			String inst = sc.nextLine();
			if(inst.equals("o")) {
				if(!q.empty()) {
					sb.append(q.pop() + "\n");
				} else {
					sb.append("empty\n");
				}
			} else if(inst.equals("c")) {
				sb.append(q.size() + "\n");
			} else {
				int num = Integer.parseInt(inst.split(" ")[1]);
				q.push(num);
			}
		}
		System.out.println(sb.toString());
	}
}
