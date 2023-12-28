package workingwithLinkedlist;

import java.util.LinkedList;

public class p1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.addFirst(10);
	l1.addFirst(25);
	l1.add(12);
	l1.add("Hello");
	System.out.println(l1);
	l1.removeFirst();
	l1.removeLast();
	System.out.println(l1);
	System.out.println(l1.getFirst());
	}
}
