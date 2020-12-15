package week1;

import java.util.*;
import java.io.*;

/*
 * �ڷᱸ��_����
 * 
 * ����_9012_��ȣ_OK
 */

/*
 * ���� ���
 * 	: ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ�.
 * 	    �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ�.
 * 	    �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����.
 */

/*
 * ���� ����
 * 	- stack�� ���Լ����̶�� Ư¡�� �̿��ؼ� Ǫ�� ����.
 * 	- ���� ��ȣ�� ������ stack�� push, ���� ��ȣ�� ������ stack���� pop.
 * 		-> ���� �� ���� ¦�� �´� ��ȣ���� �ϳ��� �Բ� �����ִ� ��ó�� ���̰� ��.
 * 	- ó������ ���� ��ȣ�� �����ϰų�, ���� ��ȣ�� �����µ� stack�� ����־ ¦�� ���� �ʴ� ���� NO�� �ٷ� ����� �� �ְ� ��.
 */
public class Bj_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            boolean flag = true;  // stack�� ����ִ� ��찡 ��� ��ȣ�� ¦�� �¾Ƽ� ����ִ� ������, ���� ��ȣ ���� ���� ��ȣ�� ���� �� ���·� ���� �������� �˷��� �����Դϴ�.
            for(int j=0; j<input.length(); j++) {
                char c = input.charAt(j);
                if(c == '(') {
                    stack.push(c);  // ������ ��ȣ stack�� �����մϴ�.
                } else {  // c == ')'
                    if(stack.isEmpty()) {  // ������ ��ȣ�� �����µ� stack�� ����ִٴ� ���� ó������ ���� ��ȣ�� ���۵Ǿ��ų�, ¦�� �ùٸ��� ���� ����Դϴ�.
                        bw.write("NO\n");
                        flag = false;  // ��ȣ�� ¦�� �ùٸ��� ���� ���� �������� �˷��ݴϴ�.
                        break;
                    } else if(stack.peek() == '(') {  // ���� ��ȣ�� �����µ� stack�� ������� ������ ¦�� �ùٸ� ����Դϴ�.
                    								  // �� �� stack�� ������� ���� ��� ����� ���ڴ� '(' ���̱� ������ else if() �� �ƴ� else �� �ᵵ �˴ϴ�.
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()) {  // ���� ��ȣ�� stack�� ���������� ¦�� �ùٸ� ��찡 �ƴմϴ�.
            	bw.write("NO\n");
            } else {
            	if(flag) bw.write("YES\n");  // stack�� ��������鼭 flag�� true�� ���� �ùٸ� ����Դϴ�.
            }
            stack.clear();  // stack�� ������� ������ ��ȣ�� ���� �ִ� ��� ���� ���ڿ��� ������ �� ������ �ֱ� ������ �ݵ�� �ʿ��� �۾��Դϴ�!
        }
        bw.flush();
	}
}
