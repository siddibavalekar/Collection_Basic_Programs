package Set_programs;

import java.util.TreeSet;

public class Adding_all_Elements_Another {
public static void main(String[] args) {
	TreeSet<String> ref=new TreeSet();
	ref.add("Red");
	ref.add("blue");
	ref.add("orange");
	System.out.println(ref);
	
	TreeSet<String> ref1=new TreeSet();
	ref1.add("Red");
	ref1.add("pink");
	ref1.add("green");
	System.out.println(ref1);
	
	ref.addAll(ref1);
	System.out.println(ref);
}
}
