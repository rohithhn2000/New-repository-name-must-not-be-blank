package workingStack;

import java.util.Stack;

public class workingStack {
	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(10);
		s1.push(54);
		s1.push(true);
		s1.push("Felcia");
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1);
		while(s1.isEmpty());
		System.out.println(s1.pop()      );
		
		
		
	}

}









