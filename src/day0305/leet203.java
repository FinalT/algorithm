package day0305;



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class leet203 {

    public ListNode removeElements(ListNode head, int val) {

        while (head!=null){
            if (head.val==val){
                head=head.next;
            }else {
                break;
            }
        }

        if (head==null)return null;

        ListNode cur =head;
        ListNode next = head.next;
        while (next!=null){
            if (next.val==val){
                cur.next=next.next;
            }else {
                cur=cur.next;
            }
            next=next.next;
        }

        return head;
    }

    public ListNode removeElementsB(ListNode head, int val) {
        if (head==null)return null;

        head.next=removeElementsB(head.next,val);

        if (head.val==val){
            return head.next;
        }else {
            return head;
        }
    }
}
