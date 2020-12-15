package week2;

import java.util.*;

public class ArraySortEx {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 2, 9, 0};
		Integer[] arr1_2 = {1, 3, 5, 2, 9, 0};
		int[][] arr2 = {{8, 15}, {7, 2}, {1, 9}};
		
		
		System.out.println("일차원 배열 정렬 예시 1");
		Arrays.sort(arr1);
		for(int a : arr1) System.out.print(a + " ");
		System.out.println("\n");
		
		System.out.println("일차원 배열 정렬 예시 2");
		Arrays.sort(arr1_2, Collections.reverseOrder());
		for(int a : arr1_2) System.out.print(a + " ");
		System.out.println("\n");
		
		
		System.out.println("이차원 배열 정렬 예시 1");
		Arrays.sort(arr2, (o1, o2) -> {return o1[0] - o2[0];});  // 이차원 배열의 0열을 기준으로 오름자순 정렬
//		Arrays.sort(arr2, (o1, o2) -> {return o2[0] - o1[0];});  // 이차원 배열의 0열을 기준으로 내림차순 정렬
		for(int i=0; i<arr2.length; i++) {
			for(int a : arr2[i]) System.out.print(a + " ");
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("이차원 배열 정렬 예시 2");
		Arrays.sort(arr2, (o1, o2) -> {return o1[1] - o2[1];});  // 이차원 배열의 1열을 기준으로 오름자순 정렬
		for(int i=0; i<arr2.length; i++) {
			for(int a : arr2[i]) System.out.print(a + " ");
			System.out.println();
		}
		System.out.println();
	}
}
