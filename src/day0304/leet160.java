package day0304;

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

public class leet160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet();
        while (headA!=null||headB!=null){
            if (headA!=null){
                if (set.contains(headA)){
                    return headA;
                }
                set.add(headA);
                headA=headA.next;
            }

            if (headB!=null){
                if (set.contains(headB)){
                    return headB;
                }
                set.add(headB);
                headB=headB.next;
            }
        }
        return null;
    }


}