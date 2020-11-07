package v1;

import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class List implements Iterable {
    private Node head;
    private Node tail;
    static final String error = "Выборка пуста, нечего удалять";
    static final String error2 = "Выборка пуста, нечего добавить";
    static final String error3 = "Индекс вне массива";

//    public List(Node head, Node tail) {   //это все становится не нужным объявлять. Иначе нужно объявить дефолт констр
//        this.head = head;                 //затем объявить нулевые значения конструктора. излишнее усложнение? разобрать
//        this.tail = tail;
//    }

    public List(int[] data) {
        head = null;
        tail = null;
    }
//
//    public List() {
//
//    }


    private boolean isEmpty() {
        return head == null;

    }

    public void addFirst(int data) {
        Node temp = new Node(data);

        if (isEmpty()) {
            tail = temp;
        } else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }

    public void addLast(int data) {
        Node temp = new Node(data);

        if (isEmpty()) {
            head = temp;
        } else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;

    }


    public void addByIndex(int data, int index) {
        if (head == null) {
            throw new RuntimeException(error2);
        } else {
            Node cur = head;
            int c = 0;


//            while (cur != null && c != index) {
//                cur = cur.next;
//                c++;
//            }

            for (int i = 0; i < List.length; i++) {
                throw new IllegalArgumentException(error3);
            }
            while (cur != null && c != index) {
                cur = cur.next;
                c++;
            }



//            while (cur != null && c != index) {
//                if (next == null){
//                    throw new IllegalArgumentException(error3);
//                }
//                cur = cur.next;
//                c++;
//            }

//            if (cur != null && c != index) {
//                cur = cur.next;
//                c++;
//            } else {
//                throw new IllegalArgumentException(error3);
//            }


            Node temp = new Node(data);


            cur.prev.next = temp;
            temp.prev = cur.prev;
            cur.prev = temp;
            temp.next = cur;

        }
    }


    public void removeFirst() {
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

    private static class Node {     //перенес сюда из отдельного класса, чтобы сделать закрытым
        public int data;            //теперь может быть доступен только здесь. Если вынести в другой класс
        public Node next;           //тогда станет доступен. это плохо, не нужно так делать
        public Node prev;


        Node(int data) {
            this.data = data;
        }
    }


}
