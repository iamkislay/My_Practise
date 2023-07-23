package com.linear_data_structure;

class QueueArray {
	private static int front,rear,cap;
	private static int[] queue;
	
	QueueArray(int size){
		front=rear=0;
		cap=size;
		queue=new int[cap];
	}
	
	static void qEnqueue(int element) {
		if(cap==rear) {
			System.out.println("Queue is full");
			return;
		}
		else {
			queue[rear]=element;
			rear++;
		}
		return;
	}
	
	static void qDequeue() {

		if(rear==front) {
			System.out.println("Queue is empty");
			return ;
		}
		else {
			for(int i=front;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
			if(rear<cap) {
				queue[rear]=0;
			}
			rear--;
		}
		return;
	}
	
	static void QueueDisplay() {
		if(rear==front) {
			System.out.println("Queue is empty");
			return ;
		}
		for(int i=front;i<rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
		return;
	}
	static void getFront() {
		if(rear==front) {
			System.out.println("Queue is empty");
			return ;
		}
		System.out.println("Front is: "+queue[front]);
		return;
	}
	
}
public class QueueusingArray{
	public static void main(String[] args) {
		QueueArray q=new QueueArray(7);
		q.qEnqueue(3);
		q.qEnqueue(4);
		q.qEnqueue(5);
		q.qEnqueue(1);
		q.QueueDisplay();
		q.qDequeue();
		q.qDequeue();
		q.QueueDisplay();
		q.qEnqueue(2);
		q.QueueDisplay();
		q.getFront();
	}
}

