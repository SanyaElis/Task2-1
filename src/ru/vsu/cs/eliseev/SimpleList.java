package ru.vsu.cs.eliseev;

public class SimpleList {
    private static class Node {
        final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node head;

    public SimpleList() {
        head = null;
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int findNumberOfMax() {
        if (isEmpty()) {
            return 0;
        }
        int k = 0;
        int dataMax = head.data;
        Node temp = head;

        while (temp != null) {
            if (temp.getData() > dataMax) {
                dataMax = temp.data;
                k = 1;
            } else if (temp.getData() == dataMax) {
                k++;
            }
            temp = temp.getNext();
        }

        return k;

    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.getNext() == null ? temp.getData() + " -> null\n" : temp.getData() + " -> ");
            temp = temp.getNext();
        }
    }
}
