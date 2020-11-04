package v1;

public class Runner {

    public static void main(String[] args) {
        List list = new List();

        list.addFirst(1);
//        list.addFirst(2);
//        list.addLast(3);
//        list.addByIndex(4, 2);
        list.print();

//
//        System.out.println();
//        list.removeFirst();
//        list.print();
//
//
//        System.out.println();
//        list.removeTail();
//        list.print();

        System.out.println();
        list.removeInside(1);
        list.print();

    }


}
