package collection;

import java.util.*;

public class List_to_Array_conversion {
	public static void main(String[] args) {
		List<Integer> ref= new ArrayList();
		ref.add(10);
		ref.add(40);
		ref.add(50);
		System.out.println(ref);
		
		//array
//		Integer a[]=ref.toArray(new Integer[ref.size()]);
		
		int a[]=new int[ref.size()];
		for(Integer it : ref) {
			for(int i =0;i<a.length;i++) {
				a[i]=ref.get(i);
			}
		}
		System.out.println(Arrays.toString(a));
		
	}

}
