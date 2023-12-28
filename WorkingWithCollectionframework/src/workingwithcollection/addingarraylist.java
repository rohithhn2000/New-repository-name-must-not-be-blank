package workingwithcollection;

import java.util.ArrayList;

public class addingarraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList();
		a1.add(10);
		a1.add(48);
		a1.add(21);
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList();
		a2.add(45);
		a2.add(48);
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println(a2.size());
		System.out.println(a1.containsAll(a2));
		
	}

}
