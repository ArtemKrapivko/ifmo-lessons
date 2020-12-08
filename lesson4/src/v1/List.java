package v1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class List implements Iterable {
    private int length;
    private Node head;
    private Node tail;
    static final String error = "Выборка пуста, нечего удалять";
    static final String error2 = "Индекс вне массива";


    private static class Node {
        public int data;
        public List.Node next;
        public List.Node prev;

        Node(int data) {
            this.data = data;
        }
    }


    private boolean isEmpty() {
        return head == null;

    }

    public void addFirst(int data) {
        Node temp = new Node(data);
        length++;

        if (isEmpty()) {
            tail = temp;
        } else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }

    public void addLast(int data) {
        Node temp = new Node(data);
        length++;

        if (isEmpty()) {
            head = temp;
        } else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;

    }




    public void addByIndex(int data, int index) {
        if (index < 0 || index > length) {
            throw new IllegalArgumentException(error2);
        }
        if (head == null) {
            head = new List.Node(data);
            tail = head;
        } else if (head == tail){
            tail = new List.Node(data);
            head.next = tail;
            tail.prev = head;
        } else {
            List.Node cur = head;
            for (int i = 0; i < index;i++) {
                cur = cur.next;
            }
            if (cur == null) {
                List.Node prev = tail;
                tail = new List.Node(data);
                tail.prev = prev;
                prev.next = tail;
            } else {
                List.Node newNode = new List.Node(data);
                newNode.prev = cur;
                newNode.next = cur.next;
                cur.next = newNode;

                if (index == length - 1) {
                    tail = newNode;
                }
            }
        }
        length++;
    }

    public void removeFirst() {
        length--;

        Node temp = head;

        if (head == null) {
            throw new RuntimeException(error);
        } else {
            if (head.next == null) {
                tail = null;
            } else {
                head.next.prev = null;
            }
            head = head.next;
        }
    }

    public void removeTail() {
        length--;

        if (tail == null) {
            throw new RuntimeException(error);
        } else {
            if (head.next == null) {
                head = null;
            } else {
                tail.prev.next = null;
            }
            tail = tail.prev;
        }
    }

    public void removeInside(int key) {
        length--;

        Node cur = head;
        if (cur == null) {
            throw new RuntimeException(error);
        } else {
            if (cur.data == key) {
                removeFirst();
            } else {
                while (cur.data != key) {
                    cur = cur.next;

                    if (cur == null) {
                        return;
                    }

                    if (cur.data == key) {              //ссылается на след.за головой элемент
                        cur.prev.next = cur.next;
                    }
                    if (cur == tail) {
                        removeTail();
                    } else {
                        cur.next.prev = cur.prev;
                    }
                }
            }
        }

    }


    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public Iterator iterator() {
        return new MyListIterator(head);
    }


    private static class MyListIterator implements Iterator {
        Node next;


        public MyListIterator(Node next) {
            this.next = next;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Object next() {
            if (next != null) {
                Object res = next.data;
                next = next.next;
                return res;
            } else
                throw new NoSuchElementException();
        }


    }


    public Iterable reverse() {     //это нужно разобрать, сделали итератор наследующийся от другого итератора
        return new Iterable() {     //наследуя другой итератор создается новый. 2 итератора сделать нельзя
            @Override
            public Iterator iterator() {
                return new BackwardIterator(tail);
            }
        };
    }

    private static class BackwardIterator implements Iterator {
        Node prev;


        public BackwardIterator(Node prev) {
            this.prev = prev;
        }

        @Override
        public boolean hasNext() {
            return prev != null;
        }

        @Override
        public Object next() {
            if (prev != null) {
                Object res = prev.data;
                prev = prev.prev;
                return res;
            } else
                throw new NoSuchElementException();
        }


    }


}
