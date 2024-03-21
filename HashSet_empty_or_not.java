package Set_programs;

import java.util.HashSet;

public class HashSet_empty_or_not {
public static void main(String[] args) {
	HashSet ref=new HashSet();
	ref.add("blue");
	ref.add("red");
	ref.add("black");
	ref.add("white");
	
	System.out.println(ref);
	System.out.println(ref.isEmpty());
	System.out.println("remove the elements form hashSet");
	ref.removeAll(ref);
	System.out.println(ref.isEmpty());
}
}
