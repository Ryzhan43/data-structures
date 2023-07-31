package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue=new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());

        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(ReverseFirstK(queue, 3));
    }

    public static Deque<Integer> ReverseFirstK(Deque<Integer> queue, int k){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for (int i=0; i<queue.size()-k;i++){
            queue.add(queue.remove());
        }
        return queue;
    }
}
