package day0302;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class leet141 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head!=null){
            if (set.contains(head)){
                return true;
            }
            set.add(head);
            head=head.next;
        }
        return false;
    }

    public boolean hasCycleB(ListNode head) {
        if (head==null||head.next==null)return false;

         ListNode slow = head;
         ListNode fast = head.next;

         while (slow!=fast){
             if (fast.next==null||fast.next.next==null){
                 return false;
             }
             slow=slow.next;
             fast=fast.next.next;
         }
        return true;
    }
}
