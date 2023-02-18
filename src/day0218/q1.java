package day0218;


import java.util.Stack;

/**
 * 【题目】
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 */

public class q1 {


    class TwoStacksQueue {
        public Stack<Integer> stackPush;
        public Stack<Integer> stackPop;
        public TwoStacksQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }


        // push 栈向 pop 栈倒入数据
        private void pushToPop() {
            if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
        }


        public void add(int pushInt) {
            stackPush.push(pushInt);
            pushToPop();
        }


        public int poll() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            }
            pushToPop();
            return stackPop.pop();
        }


        public int peek() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            }
            pushToPop();
            return stackPop.peek();
        }
    }
}
