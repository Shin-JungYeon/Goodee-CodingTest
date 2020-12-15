package week3;

import java.io.*;
import java.util.*;

/*
 * 백준_8958_OX퀴즈_OK
 */
public class Bj_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			String OX = br.readLine();
			List<Integer> list = new ArrayList<>();
			int cnt = 0;
			for(int j=0; j<OX.length(); j++) {
				if(j > 0 && OX.charAt(j-1) == 'O') {
					if(OX.charAt(j) == 'O') {  // 연속
						cnt++;
					} else {  // 연속 끊김
						list.add(cnt);
						cnt = 0;  // 연속 갯수 초기화
					}
				} else {
					if(OX.charAt(j) == 'O') {  // 처음 시작이 O이거나, 새로 O로 시작.
						cnt++;
					}
				}
			}
			if(cnt != 0) list.add(cnt);  // O로 끝난 경우의 cnt 저장.
			int score = 0;
			for(int l : list) {
				score += (l * (l+1) / 2);
			}
			bw.write(score + "\n");
		}
		bw.flush();
	}
}
