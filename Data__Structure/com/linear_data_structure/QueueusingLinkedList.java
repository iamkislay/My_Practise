package com.linear_data_structure;


class QueueLL{
	private Node front,rear;
	private int qsize;
	
	private class Node{
		int data;
		Node next;
		
	}
	
	QueueLL(){
		qsize=0;
		front=rear=null;
		
	}
	
	public boolean isEmpty() {
		return (qsize==0);
	}
	
	
	public void  Enqueue(int data) {
		
		Node newnode=rear;
		rear=new Node();
		rear.data=data;
		rear.next=null;
		if(isEmpty()) {
			front=rear;
		}
		else {
			newnode.next=rear;
			
		}
		qsize++;
	}
	
	public int DeQueue() {
		int value =front.data;
		front=front.next;
		
		if(isEmpty()) {
			rear=null;
		
		}
		qsize--;
		//System.out.println(value+" is deleted from queue");
		return value;
	}
	
	public void display_queue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			Node temp=front;
			for(int i=0;i<qsize;i++) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}

public class QueueusingLinkedList {
	public static void main(String[] args) {
		QueueLL q=new QueueLL();
		q.Enqueue(2);
		q.Enqueue(5);
		q.display_queue();
		q.Enqueue(1);
		q.display_queue();
		System.out.println(q.DeQueue()+ " is removed");
		q.display_queue();
	}
}
