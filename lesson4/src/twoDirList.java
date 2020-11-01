import java.util.Iterator;
import java.util.NoSuchElementException;

public class twoDirList implements Iterable {
    private ListItem head;
    private ListItem tail;


    public void addToHead(Object val) {
        if (head != tail) {
            ListItem h = new ListItem(val);
            h.prev = null;
            head.prev = h;
            h.next = head;
            head = h;
        } else
            head = tail = new ListItem(val);
    }

    public Object peekFromHead() {
        return head != null ? head.val : null;
    }


    public Object removeFromHead() {
        if (head == null)
            return null;

        Object res = head.val;
        if (head != tail)
            head = head.next;
        else head = tail = null;
        return res;
    }


    public void addToTail(Object val) {
        if (tail != null) {
            tail.next = new ListItem(val);
            tail.next.prev = tail;
            tail = tail.next;
        }

    }

    public Object peekFromTail() {
        return tail != null ? tail.val : null;
    }

    public Object removeFromTail() {
        if (tail == null)
            return null;

        Object res = tail.val;
        if (tail != head)
            tail = tail.next;
        else tail = head = null;
        return res;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public boolean contains(Object val) {
        ListItem n = head;
        while (n != null) {
            if (n.val == null && val == null
                    || n.val != null && n.val.equals(val))
                break;
            n = n.next;
        }
        return n != null;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(head,tail);
    }


    private static class ListItem {
        Object val;
        ListItem next;
        ListItem prev;

        ListItem(Object val) {
            this.val = val;
        }
    }


    private static class ListIterator implements Iterator {
        ListItem next;
        ListItem prev;

        public ListIterator(ListItem next, ListItem prev) {
            this.next = next;
            this.prev = prev;

        }


        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Object next() {
            if (next != null) {
                Object res = next.val;
                next = next.next;
                return res;
            } else
                throw new NoSuchElementException();
        }
    }


//
//    public static void main(String[] args) {
//        TwoDirList l = new TwoDirList();
//        l.addToTail("111");
//        l.addToTail("222");
//        l.addToTail("333");
//        l.addToTail("aaa");
//        l.addToTail("bbb");
//        for (Object v : l)
//            System.out.println(v);
//
//        System.out.println(l.isEmpty());
//        System.out.println(l.contains("333") + ", " + l.contains("555"));
//        System.out.println(l.peekFromHead());
//        System.out.println(l.peekFromTail());
//        System.out.println();
//
//        l.removeFromHead();
//        l.addToHead("ccc");
//        l.addToTail("zzz");
//        for (Object v : l)
//            System.out.println(v);
//    }


}
