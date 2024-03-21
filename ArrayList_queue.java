package collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class ArrayList_queue {
	public static void main(String[] args) {
		List<Integer> ref=new ArrayList();
//		
		ref.add(1);
		ref.add(2);
		ref.add(3);
		
//		LinkedList ref1=new LinkedList(ref);
//		Stack ref1=new Stack(ref);
		Set ref1=new HashSet(ref);
//		Set ref1=new LinkedHashSet(ref);
		
//		System.out.println(ref);
//		Queue ref1=new ArrayDeque(ref);
		System.out.println(ref1);
	}

}
