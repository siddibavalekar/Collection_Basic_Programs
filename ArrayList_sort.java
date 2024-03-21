package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_sort {
	public static void main(String[] args) {
		ArrayList<String> ref=new ArrayList();
		ref.add("siddhi");
		ref.add("ritu");
		ref.add("neha");
		System.out.println(ref);
		Collections.sort(ref);
		System.out.println(ref);
		
		
	}

}
