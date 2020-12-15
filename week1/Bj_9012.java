package week1;

import java.util.*;
import java.io.*;

/*
 * 자료구조_스택
 * 
 * 백준_9012_괄호_OK
 */

/*
 * 문제 요약
 * 	: 괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열.
 * 	    그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부름.
 * 	    입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내기.
 */

/*
 * 문제 접근
 * 	- stack의 후입선출이라는 특징을 이용해서 푸는 문제.
 * 	- 열린 괄호를 만나면 stack에 push, 닫힌 괄호를 만나면 stack에서 pop.
 * 		-> 가장 안 쪽의 짝이 맞는 괄호부터 하나씩 함께 없애주는 것처럼 보이게 함.
 * 	- 처음부터 닫힌 괄호로 시작하거나, 닫힌 괄호를 만났는데 stack이 비어있어서 짝이 맞지 않는 경우는 NO를 바로 출력할 수 있게 함.
 */
public class Bj_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            boolean flag = true;  // stack이 비어있는 경우가 모든 괄호의 짝이 맞아서 비어있는 것인지, 열린 괄호 없이 닫힌 괄호를 만나 빈 상태로 끝난 것인지를 알려줄 변수입니다.
            for(int j=0; j<input.length(); j++) {
                char c = input.charAt(j);
                if(c == '(') {
                    stack.push(c);  // 열리는 괄호 stack에 저장합니다.
                } else {  // c == ')'
                    if(stack.isEmpty()) {  // 닫히는 괄호를 만났는데 stack이 비어있다는 것은 처음부터 닫힌 괄호로 시작되었거나, 짝이 올바르지 않은 경우입니다.
                        bw.write("NO\n");
                        flag = false;  // 괄호의 짝이 올바르지 않은 경우로 끝났음을 알려줍니다.
                        break;
                    } else if(stack.peek() == '(') {  // 닫힌 괄호를 만났는데 stack이 비어있지 않으면 짝이 올바른 경우입니다.
                    								  // 이 때 stack이 비어있지 않은 경우 저장된 문자는 '(' 뿐이기 때문에 else if() 가 아닌 else 로 써도 됩니다.
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()) {  // 열린 괄호가 stack에 남아있으면 짝이 올바른 경우가 아닙니다.
            	bw.write("NO\n");
            } else {
            	if(flag) bw.write("YES\n");  // stack이 비어있으면서 flag가 true일 때만 올바른 경우입니다.
            }
            stack.clear();  // stack을 비워주지 않으면 괄호가 남아 있는 경우 다음 문자열을 검증할 때 영향을 주기 때문에 반드시 필요한 작업입니다!
        }
        bw.flush();
	}
}
