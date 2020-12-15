package week3;

import java.io.*;

/*
 * 백준_2908_상수_OK
 */
public class Bj_2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] nums = input.split(" ");
		int[] ns = new int[2];
		for(int i=0; i<2; i++) {
			StringBuffer sb = new StringBuffer();
			for(byte n : nums[i].getBytes()) {
				sb.append((char)n);
			}
			sb.reverse();
			ns[i] = Integer.parseInt(sb.toString());
		}
		System.out.println(Math.max(ns[0], ns[1]));
	}
}
