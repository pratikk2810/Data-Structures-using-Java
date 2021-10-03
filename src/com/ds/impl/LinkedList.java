package com.ds.impl;

public class LinkedList<T> {

	private int size = 0;
	static class Node<T> {
		T data;
		Node<T> next;
	}
	
	Node<T> head;
	
	public void add(T data) {
		
		Node<T> newNode = new Node<>();
		newNode.data = data;
		newNode.next = null;
		
		if(head ==  null) {
			head = newNode;
			this.size++;
		}
		else {
			Node<T> temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			this.size++;
		}
	}
	
	public void addAtStart(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		this.size++;
	}
	
	public void addAtEnd(T data) {
		Node<T> temp = head;
		Node<T> newNode = new Node<>();
		newNode.data = data;
		newNode.next = null;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		this.size++;
	}
	public void addAt(int index, T data) {
		
		if(index == 0) {
			this.addAtStart(data);
		}
		else if(index < 0 || index > this.getSize()) {
			System.out.println("Please enter valid index.");
		}
		else {
			Node<T> newNode = new Node<>();
			newNode.data = data;
			newNode.next = null;
			
			Node<T> temp = head;
			for(int i=0;i<index-1;i++) {
				temp = temp.next;
			}
			Node<T> node = temp.next;
			temp.next = newNode;
			newNode.next = node;
			this.size++;
		}
	}
	
	public void delete(int index) {
		Node<T> temp = head;
		for(int i=0;i<index-1;i++) {
			temp = temp.next;
		}
		Node<T> node = temp.next;
		temp.next = node.next;
		node = null;
		this.size--;
	}
	public void print() {
		Node<T> temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + "\n");
	}
	
	public T get(int index) {
		Node<T> temp = head;
		if(index < 0 || index > this.getSize()) {
			System.out.println("Please enter valid index.");
			return null;
		}
		else {
			for(int i=0;i<index;i++) {
				temp = temp.next;
			}
		}
		return temp.data;
	}
	public int getSize() {
		return this.size;
	}
}
