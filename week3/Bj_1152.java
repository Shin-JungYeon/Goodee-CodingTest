package week3;

import java.util.*;

/*
 * ����_1152_�ܾ��� ����_OK
 */
public class Bj_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] words = input.split(" ");
		if(words.length == 1 && words[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(words.length);			
		}
	}
}
