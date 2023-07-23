package Practise_1;

class MyLinkedList {

    Node head,tail;
    int size;

    class Node{
        int data;
        Node next;

        Node(int data){
          this.data=data;
          this.next=null;
        }
    }

   
    public boolean isEmpty(){
        if(head==null && tail==null){
            return true;

        }
        else{
            return false;
        }
    }
    public MyLinkedList() {

        head=tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index>size-1){
            return -1;
        }
        else{
            int count=0;
            Node temp=head;
            while(count<index){
                temp=temp.next;
                count++;
            }
            return temp.data;
        }
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(isEmpty()){
            head=newNode;
            tail=head;
        }
        else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
        size++;

    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(isEmpty()){
            tail=newNode;
            head=tail;
        }
        else{
            Node temp=tail;
            tail=newNode;
            temp.next=tail;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        else if(index==size) {
        	this.addAtTail(val);
        	return;
        }

        else if(index==0) {
        	this.addAtHead(val);
        	return;
        }
        else{
        	//System.out.println("in else block");
            int count=0;
            Node temp=head;
            while(count<index-1){
                temp=temp.next;
                count++;
            }
            Node newNode=new Node(val);
            Node temp2=temp.next;
            temp.next=newNode;
            newNode.next=temp2;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>size-1){
            return;
        }
        else if(index==0){
           // System.out.println(head.data+ " is deleted");
            head=head.next;
        }
        
        else{
            int count=0;
            Node temp=head;
            while(count<index-1){
                temp=temp.next;
                count++;
            }
            if(index==size-1){
                tail=temp;
            }
            else{
            Node toDelete=temp.next;
           // System.out.println(toDelete.data+ " is deleted");
            temp.next=toDelete.next;
            }
        }
        size--;
    }

}

public class LinkedListImplement {
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();

		
		myLinkedList.addAtIndex(0,10);
		System.out.println( myLinkedList.get(0)+" "); 
		myLinkedList.addAtIndex(0,20);    
		System.out.print( myLinkedList.get(0)+" "); 
		System.out.println( myLinkedList.get(1)+" "); 
		myLinkedList.addAtIndex(5,0);    
		
	}
}
