package week1;

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            boolean flag = true;						// (1)
            for(int j=0; j<input.length(); j++) {
                char c = input.charAt(j);
                if(c == '(') {
                    stack.push(c);						// (2)
                } else {  // c == ')'
                    if(stack.isEmpty()) {				// (3)
                        bw.write("NO\n");
                        flag = false;					// (4)
                        break;
                    } else if(stack.peek() == '(') {	// (5)
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty()) {						// (6)
            	bw.write("NO\n");
            } else {
            	if(flag) bw.write("YES\n");				// (7)
            }
            stack.clear();								// (8)
        }
        bw.flush();
	}
}




