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
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // Ư���� �����ڸ� �������� ���ڿ��� ��ūȭ ���ִ� Ŭ����. �����ڸ� ��������� ������ �⺻������ �������� ����.
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, (o1, o2) -> {return o1[0] - o2[0];});  // �迭�� 0���� �������� ��������.
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
