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
		
		
		System.out.println("����Ʈ ���� ���� 1 : Collections Ŭ����");
		Collections.sort(list1);  // ��������
		for(int l : list1) System.out.print(l + " ");
		System.out.println("\n");
		
		
		System.out.println("����Ʈ ���� ���� 2 : Collections Ŭ����");
		Collections.reverse(list1);  // ��������
		for(int l : list1) System.out.print(l + " ");
		System.out.println("\n");
		
		
		System.out.println("����Ʈ ���� ���� 3");
		list1.sort((o1, o2) -> {return o1 - o2;});  // ��������
//		list1.sort((o1, o2) -> {return o2 - o1;});  // ��������
		for(int l : list1) System.out.print(l + " ");
		System.out.println("\n");
		
		
		System.out.println("int�迭�� ���ҷ� ���� ����Ʈ ���� ���� 1");
		list2.sort((o1, o2) -> {return o1[0] - o2[0];});  // ������ 0���� �������� ��������.
		for(int i = 0; i<list2.size(); i++) {
			for(int l : list2.get(i)) System.out.print(l + " ");
			System.out.println();
		}
		System.out.println();
	}
}
