package ru.avalon.java.main;

public class BitSetDemo {
    public static void main(String[] args) {

        showBitSetUsage(new ArrayBitSet());
    }


    static void showBitSetUsage(ArrayBitSet abs){
        abs.set(1);
        abs.set(5);
        abs.set(10);
        abs.set(12);
        abs.set(3,true);
        abs.set(4,true);
        System.out.println(abs.toString().substring(0,1024));
        System.out.println(abs.count());
        System.out.println(abs.check(0));
        System.out.println(abs.check(1));

        abs.set(3,false);
        abs.clear(4);
        System.out.println(abs.toString().substring(0,30));
        System.out.println(abs.count());
        System.out.println(abs.check(0));
        System.out.println(abs.check(1));

        try {
            abs.set(BitSet.SIZE + 1);
        }catch(Exception e){
            System.out.println("(!) Exception" + e.getMessage());
        }
    }
}
