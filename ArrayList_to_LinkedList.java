package collection;

import java.util.*;

public class ArrayList_to_LinkedList {
public static void main(String[] args) {
	ArrayList ref= new ArrayList();
	ref.add(40);
	ref.add(50);
//	System.out.println(ref);
	
//	Stack res=new Satck(ref);
	
	List ref1 = new LinkedList(ref);
//	System.out.println(ref1);
	
	Queue que = new PriorityQueue(ref);
	que.add(1);
	que.add(2);
	System.out.println(que);
	
//	Queue<Integer> ref5=new ArrayDequee(ref);
	
	Queue que1 = new LinkedList();
	
	Set set1 = new HashSet(que);
	
//	Map map = new HashMap();
//	map.put("hi", 2);
//	map.put("bye", 1);
//	
//	Set<Entry> 
//	System.out.println(map);
	
	
}
}
