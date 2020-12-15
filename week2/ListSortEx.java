package week2;

import java.util.*;

public class ListSortEx {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		for(int i=0; i<5; i++) {
			list1.add((int) (Math.random()*100));
		}
		List<int[]> list2 = new ArrayList<>();
		for(int i=0; i<5; i++) {
			list2.add(new int[] {(int)(Math.random()*100), (int)(Math.random()*100)});
		}
		
		
		System.out.println("리스트 정렬 예시 1 : Collections 클래스");
		Collections.sort(list1);  // 오름차순
		for(int l : list1) System.out.print(l + " ");
		System.out.println("\n");
		
		
		System.out.println("리스트 정렬 예시 2 : Collections 클래스");
		Collections.reverse(list1);  // 내림차순
		for(int l : list1) System.out.print(l + " ");
		System.out.println("\n");
		
		
		System.out.println("리스트 정렬 예시 3");
		list1.sort((o1, o2) -> {return o1 - o2;});  // 오름차순
//		list1.sort((o1, o2) -> {return o2 - o1;});  // 내림차순
		for(int l : list1) System.out.print(l + " ");
		System.out.println("\n");
		
		
		System.out.println("int배열을 원소로 갖는 리스트 정렬 예시 1");
		list2.sort((o1, o2) -> {return o1[0] - o2[0];});  // 원소의 0열을 기준으로 오름차순.
		for(int i = 0; i<list2.size(); i++) {
			for(int l : list2.get(i)) System.out.print(l + " ");
			System.out.println();
		}
		System.out.println();
	}
}
