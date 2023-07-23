package Practise_1;
// class ListNode {
//		int val;
//	    ListNode next;
//	    ListNode() {}
//	    ListNode(int val) { this.val = val; }
//	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//	  }

public class RemoveNthFromlast {
	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        int size=0;
	        int count=1;
	        ListNode temp=head;
	        while(temp!=null){
	            size++;
	            temp=temp.next;
	        }
	        temp=head;
	        if(n==size){
	            head=head.next;
	        }
	        else if(n==1){
	            while(count<size-n){
	                temp=temp.next;
	                count++;
	             }
	            temp.next=null;
	        }
	        
	       
	        else{
	             while(count<size-n){
	                temp=temp.next;
	                count++;
	             }
	            temp.next=temp.next.next;
	        }
	        return head;
	    }
	}
}
