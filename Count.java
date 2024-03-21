package collection;

import java.util.Arrays;

public class Count {
	public static void main(String[] args) {
		String arr[]= {"ritika","neha","siddhi","sakshi","pranali"};
		System.out.println(Arrays.toString(arr));
		String str[]=new String[arr.length];
		

		char ch[]=new char[str.length];
		
		for(int i=0;i<arr.length;i++) {
			char c = arr[i].charAt(0);
			ch[i]=c;
			
				
		}
		
	}
	

}
