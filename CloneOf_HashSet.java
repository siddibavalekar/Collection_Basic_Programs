package Set_programs;

import java.util.HashSet;

public class CloneOf_HashSet {
	public static void main(String[] args) {
		HashSet ref=new HashSet();
		ref.add("blue");
		ref.add("red");
		ref.add("black");
		ref.add("white");
		
		System.out.println(ref);
		
		HashSet new_hashset=new HashSet();
		new_hashset= (HashSet) ref.clone();
		System.out.println(new_hashset);
	}

}
