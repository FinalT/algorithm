package day0315;

import java.util.LinkedList;
import java.util.Queue;

public class leet225 {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public leet225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }


    public void push(int x){
        queue2.offer(x);
        while (queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 =  queue2;
        queue2 = temp;
    }

    public void pushb(int x){
        int n = queue1.size();
        queue1.offer(x);
        for (int i = 0; i < n; i++) {
            queue1.offer(queue1.poll());
        }
    }

    public int pop(){
        return queue1.poll();
    }

    public int top(){
        return queue1.peek();
    }

    public boolean empty(){
        return queue1.isEmpty();
    }
}
