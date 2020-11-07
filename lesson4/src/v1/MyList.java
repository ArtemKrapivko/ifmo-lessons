package v1;

public class MyList {
    private int length;
    private Node head;
    private Node tail;

    private static class Node {     //перенес сюда из отдельного класса, чтобы сделать закрытым
        public int data;            //теперь может быть доступен только здесь. Если вынести в другой класс
        public Node next;           //тогда станет доступен. это плохо, не нужно так делать
        public Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void addByIndex(int data, int index) {
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("Индекс за пределами списка");
        }
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else if (head == tail){
            tail = new Node(data);
            head.next = tail;
            tail.prev = head;
        } else {
            Node cur = head;
            for (int i = 0; i < index;i++) {
                cur = cur.next;
            }
            if (cur == null) {
                Node prev = tail;
                tail = new Node(data);
                tail.prev = prev;
                prev.next = tail;
            } else {
                Node newNode = new Node(data);
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

    public int getByIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException("Индекс за пределами списка");
        }
        if (head == null) {
            throw new IllegalArgumentException("Список пустой");
        }
        Node cur = head;
        for (int i = 0; i < index;i++) {
            cur = cur.next;
        }
        return cur.data;
    }

    public void remove(int key) {
        if (head == null) {
            throw new IllegalArgumentException("Список пустой");
        }
        Node cur = head;
        while (cur.data != key) {
            if (cur.next == null) {
                return;
            }
            cur = cur.next;
        }
        if (cur == head && head == tail) {
            head = null;
            tail = null;
        } else if (cur == head) {
            Node next = head.next;
            next.prev = null;
            head = next;
        } else if (cur == tail) {
            Node prev = tail.prev;
            prev.next = null;
            tail = prev;
        } else {
            Node prev = cur.prev;
            Node next = cur.next;
            prev.next = next;
            next.prev = prev;
            cur = null;
        }
        length--;
    }

    public int getFirst() {
        if (head == null) {
            throw new IllegalArgumentException("Список пустой");
        }
        return head.data;
    }

    public int size() {
        return length;
    }
}
