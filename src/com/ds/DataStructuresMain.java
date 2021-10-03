package com.ds;

import com.ds.impl.Stack;

public class DataStructuresMain {

	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<>();
		System.out.println("Capacity : " + stack.getCapacity());
		stack.push(9);
		stack.push(7);
		stack.push(5);
		stack.print();
		System.out.println("Capacity : " + stack.getCapacity());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.print();
		System.out.println();
		System.out.println("Capacity : " +stack.getCapacity());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
