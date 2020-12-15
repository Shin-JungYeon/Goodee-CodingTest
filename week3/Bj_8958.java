package week3;

import java.io.*;
import java.util.*;

/*
 * ����_8958_OX����_OK
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
					if(OX.charAt(j) == 'O') {  // ����
						cnt++;
					} else {  // ���� ����
						list.add(cnt);
						cnt = 0;  // ���� ���� �ʱ�ȭ
					}
				} else {
					if(OX.charAt(j) == 'O') {  // ó�� ������ O�̰ų�, ���� O�� ����.
						cnt++;
					}
				}
			}
			if(cnt != 0) list.add(cnt);  // O�� ���� ����� cnt ����.
			int score = 0;
			for(int l : list) {
				score += (l * (l+1) / 2);
			}
			bw.write(score + "\n");
		}
		bw.flush();
	}
}
