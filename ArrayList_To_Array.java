package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_To_Array {
	public static void main(String[] args) {
		ArrayList ref=new ArrayList();
		ref.add(2);
		ref.add(3);
		ref.add(6);
		ref.add(10);
		
		Object arr[]=ref.toArray();
		{
			for(int i=0;i<arr.length;i++)
			{
			System.out.println(arr[i]);
			}
		}
		System.out.println(Arrays.toString(arr));
		}

}
