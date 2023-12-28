package workingwithcollection;

import java.util.ArrayList;

public class Genericarraylist {
	public static void main(String[] args) {
		ArrayList  a1=new ArrayList();
		a1.add("subash");
		a1.add("asit");
		//a1.add(10);
		//a1.add(5555555555555555.1);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
		a1.set(i,((String)a1.get(i)).substring(0,1).toUpperCase()+((String)a1.get(i)).substring(1));
		}
		System.out.println(a1);
		
		
	}

}
