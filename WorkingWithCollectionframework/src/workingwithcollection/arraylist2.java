package workingwithcollection;

import java.util.ArrayList;

public class arraylist2 {
	

	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(10);
		System.out.println(a1);
		a1.add(1,100);
		System.out.println(a1);
		System.out.println(a1.size()-1);
		System.out.println(3);
		System.out.println(a1);
		for(Object o:a1) {
			System.out.println(o);
		}
		
		
		
	}

}
