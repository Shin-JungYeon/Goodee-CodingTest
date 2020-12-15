package week3;

import java.util.*;

/*
 * 자료구조 - 스택
 * 
 * 백준_3986_좋은 단어
 */
public class Bj_3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int goodWord = 0;
		for(int i=0; i<N; i++) {
			String word = sc.next();
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<word.length(); j++) {
				char c = word.charAt(j);
				if(stack.isEmpty()) {
					stack.push(c);					
				} else if(stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
			if(stack.isEmpty()) goodWord++;
		}
		System.out.println(goodWord);
	}
}
