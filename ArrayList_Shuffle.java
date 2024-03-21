package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Shuffle {
	public static void main(String[] args) {
	ArrayList ref=new ArrayList();
	ref.add(5);
	ref.add(7);
	ref.add(8);
	ref.add(9);
	System.out.println(ref);
	Collections.shuffle(ref);
	System.out.println(ref);
	}
	

}
