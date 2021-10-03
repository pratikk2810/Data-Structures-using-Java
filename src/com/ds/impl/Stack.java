package com.ds.impl;

@SuppressWarnings("unchecked")
public class Stack<T> {
	int top=0;
	int size = 0;
	int capacity = 2;
	Object stack[];
	
	public Stack( ) {
		stack = new Object[capacity];
	}
	public void push(T obj) {
		if(size>= capacity) {
			grow();
		}
		stack[top] = obj;
		top++;
		size++;
	}
	
	private void grow() {
		Object newStack[] = new Object[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, size);
		capacity *= 2;
		stack = newStack;
		
	}
	public T pop() {
		T element = null;
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		else {
			if(size <= (capacity/2)/2) {
				shrink();
			}
			element = (T) stack[top];
			stack[top] =null;
			top--;
			size--;
		}
		return element;
	}
	
	private void shrink() {
		Object newStack[] = new Object[capacity/2];
		System.arraycopy(stack, 0, newStack, 0, size);
		capacity /=2;
		stack = newStack;
	}
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		return (T)stack[top-1];
	}
	
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(stack[i] + " ");
		}
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	public int getCapacity() {
		return this.capacity;
	}
}
