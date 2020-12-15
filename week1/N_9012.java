package week1;

import java.util.*;

public class N_9012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<n;i++) {
			boolean sw = false;
			String s = scan.next();
			for(int j=0;j<s.length();j++) {
				char ch = s.charAt(j);
				if(j==0 && ch==')') {
					sw = true;
					break;
				}
				
				if(ch=='(') {
					st.add(ch);
				}else if(ch==')') {
					if(st.empty()) {
						sw = true;
						break;
					}
					st.pop();
				}
			}
			if(st.empty() && sw == true) {
				System.out.println("NO");
			} else if(st.empty()){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			st.clear();
		}
	}
}



