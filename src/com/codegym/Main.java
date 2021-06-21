package com.codegym;


public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        Solution.enQueue(q, 14);
        Solution.enQueue(q, 22);
        Solution.enQueue(q, 6);

        Solution.show(q);

        System.out.printf("Deleted value = %d", Solution.deQueue(q));
        System.out.printf("\nDeleted value = %d", Solution.deQueue(q));

        Solution.enQueue(q, 9);
        Solution.enQueue(q, 20);
        Solution.show(q);
    }
}
