package com.bridgelabz;

    public class Node <T extends Comparable<T>>{
        public T key;
        public int value;
        public Node next;

        Node(T key){
            this.key = key;
            this.value = 1;
            this.next = null;
        }
}
