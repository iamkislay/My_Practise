package Practise_1;

import java.util.HashSet;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }


public class linkedListCycle {
	 public boolean hasCycle(ListNode head) {
	        HashSet<ListNode> store =new HashSet<ListNode>();
	        
	        while(head!=null){
	            if(store.contains(head)){
	                return true;
	            }
	            store.add(head);
	            head=head.next;
	            
	            
	        }
	        return false;
	       
	    }
	 
}
