package com.linear_data_structure;
class StackLL{
	Node top;
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			//this.next=null;
		}
	}
	
	StackLL(){
		
		top=null;
	}
	
	boolean isEmpty() {
		if(top==null)
			return true;
		else
			return false;
	}
	
	void push(int data) {
		
		
		Node newN =new Node(data);
		//newN.data=data;
		if(top==null) {
			top=newN;
			//return;
			}
		else {
		Node newNode=top;
		top=newN;
		top.next=newNode;}
		
		
	}
	int pop() {
		int ans=Integer.MIN_VALUE;
		if(top==null) {
			System.out.println("Stack underflow!");
			return ans;
		}
		else {
		ans=top.data;
		top=top.next;
		System.out.println("popped value is: "+ans);
		return ans;}
	}
	int peek() {
		int ans=Integer.MIN_VALUE;
		if(isEmpty()) {
			System.out.println("Stack underflow!");
			return ans;
		}
		else {
		ans=top.data;
		
		System.out.println("peeked value is: "+ans);
		return ans;}
	}
	
	
}


public class stackusingLinkedList {
	public static void main(String[ ]args) {
		StackLL stk=new StackLL();
		stk.peek();
		stk.push(2);
		stk.push(9);
		stk.push(8);
		stk.peek();
		stk.push(10);
		stk.pop();
		stk.push(11);
		stk.pop();
		stk.peek();
	}
}
