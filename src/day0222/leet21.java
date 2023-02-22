package day0222;

import java.util.ArrayList;
import java.util.List;

public class leet21 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null){
            return list2;
        }else if (list2==null){
            return list1;
        }else if (list1.val< list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next=mergeTwoLists(list2.next,list1);
            return list2;
        }
    }
}
