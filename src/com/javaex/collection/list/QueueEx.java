package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.offer(i);
            System.out.println(q);
        }
        System.out.println("===== peek?======");
        System.out.println(q.peek());
        System.out.println("===== let's poll======");
        while (!q.isEmpty()) {
            System.out.println("poll: " + q.poll());
            System.out.println(q);
        }
        System.out.println("===== one more poll======");
        System.out.println("poll: " + q.poll());
        System.out.println(q);
    }
}
