package week1;

import java.util.*;
import java.io.*;

public class DataStructureEx {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<10; i++) {
//			System.out.println(sc.nextInt());
//			System.out.println(sc.next());
//			System.out.println(sc.nextLine());
//		}		
//		
//		Stack<Integer> stack = new Stack<>();  // 스택 클래스 존재.
//		
//		Queue<Integer> queue = new LinkedList<>();  // 큐는 링크드리스트로 사용.
//		
//		
//		Deque<Integer> deque = new ArrayDeque<>();  // 데큐인터페이스를 구현한 클래스로 사용.
//		deque.addFirst(1);
//		deque.addFirst(2);
//		deque.addLast(3);
//		deque.addLast(4);
//		while(!deque.isEmpty()) {
//			System.out.println(deque.pollFirst());
//		}
//		System.out.println();
//		
//		
//		PriorityQueue<Integer> prique1 = new PriorityQueue<>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 - o2;
//			}
//		});
//		PriorityQueue<Integer> prique2 = new PriorityQueue<>((o1, o2) -> {return o1 - o2;});
//		
//		prique1.add(3);
//		prique1.add(4);
//		prique1.add(1);
//		while(!prique1.isEmpty()) {
//			System.out.println(prique1.poll());
//		}
//		System.out.println();
//		prique2.add(3);
//		prique2.add(4);
//		prique2.add(1);
//		while(!prique2.isEmpty()) {
//			System.out.println(prique2.poll());
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
        	Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            boolean flag = true;
            for(int j=0; j<input.length(); j++) {
                char c = input.charAt(j);
                if(c == '(') {
                    stack.push(c);
                } else {  // c == ')'
                    if(stack.isEmpty()) {
                        bw.write("NO\n");
                        flag = false;
                        break;
                    } else if(stack.peek() == '(') {
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()) {
            	bw.write("NO\n");
            } else {
            	if(flag) bw.write("YES\n");
            }
        }
        bw.flush();
	}
}
