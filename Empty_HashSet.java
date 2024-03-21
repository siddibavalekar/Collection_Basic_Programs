package Set_programs;

import java.util.HashSet;

public class Empty_HashSet {
	public static void main(String[] args) {
		HashSet ref=new HashSet();
		ref.add("blue");
		ref.add("red");
		ref.add("black");
		ref.add("white");
		
		System.out.println(ref);
		ref.removeAll(ref);
		System.out.println(ref);
	}

}
