package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_to_stringArray {
	public static void main(String[] args) {
		ArrayList<String> ref=new ArrayList();
		ref.add("hii");
		ref.add("my");
		ref.add("name");
		
		Object arr[]=ref.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
