package Set_programs;

import java.util.Iterator;
import java.util.TreeSet;

public class Reverse_TreeSet {
	public static void main(String[] args) {
		TreeSet<String> ref=new TreeSet();
		ref.add("Red");
		ref.add("blue");
		ref.add("green");
		System.out.print(ref);
		
		Iterator ref2=ref.descendingIterator();
		
		while(ref2.hasNext())
		{
			System.out.print(" "+(ref2.next()));
		}
	}

}
