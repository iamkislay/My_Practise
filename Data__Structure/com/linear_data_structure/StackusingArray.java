package com.linear_data_structure;

class StackArray{
	private final int size=10000;
	private int top;
	private int[] stackarr=new int[size];
	
	StackArray() {
		top=-1;
	}
	
	public boolean isEmpty() {
		return (top<0);
	}
	
	public boolean push(int data) {
		if(top>size-1) {
			System.out.println("Stack Overflow!");
			return false;
		}
		else {
			top++;
			stackarr[top]=data;
			return true;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			return stackarr[top--];
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			System.out.println(stackarr[top]);
			return stackarr[top];
		}
	}
	public void displayStack() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
			return ;
		}
		else {
			int temp=0;
			while(temp<=top) {
				System.out.print(stackarr[temp++]);
			}
			System.out.println();
		}
	}
}

public class StackusingArray {
	public static void main(String[ ]args) {
		StackArray stk=new StackArray();
		stk.displayStack();
		stk.push(2);
		stk.push(9);
		stk.push(8);
		stk.displayStack();
		stk.peek();
		stk.pop();
		stk.pop();
		stk.displayStack();
	}
}
