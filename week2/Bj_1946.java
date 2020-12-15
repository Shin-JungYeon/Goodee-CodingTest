package week2;

import java.io.*;
import java.util.*;

public class Bj_1946 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][2];
			for(int j=0; j<N; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // 특정한 구분자를 기준으로 문자열을 토큰화 해주는 클래스. 구분자를 명시해주지 않으면 기본적으로 공백으로 구분.
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, (o1, o2) -> {return o1[0] - o2[0];});  // 배열의 0열을 기준으로 오름차순.
			int cnt = N;
			int minRank = 100000;
			for(int j=0; j<N; j++) {
				minRank = Math.min(minRank, arr[j][1]);
				if(arr[j][1] > minRank) cnt--;
			}
			bw.write(cnt + "\n");
		}
		bw.flush();
	}
}
