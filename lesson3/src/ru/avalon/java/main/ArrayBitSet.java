package ru.avalon.java.main;

public class ArrayBitSet implements BitSet {
    private boolean[] array = new boolean[SIZE];

    @Override
    public boolean check(int index) {
        checkI(index);
        return array[index];
    }

    @Override
    public void set(int index) {
        array[index] = true;
    }

    @Override
    public void set(int index, boolean value) {
        array[index] = value;
    }

    @Override
    public void clear(int index) {
        array[index] = false;
    }

    @Override
    public void invert(int index) {
        checkI(index);
        array[index] = !array[index];
    }

    private void checkI(int index) {
        if (index < 0 || index >= SIZE)
            throw new IllegalArgumentException("Index is incorrect");
    }

    @Override
    public int count() {
        int cnt = 0;
//        for (int i = 0; i < array.length; i++) ;
//        if (array[i])
//            cnt++;

        for (boolean b : array) {
            if (b)
                cnt++;
        }
        return cnt;

    }

    @Override
    public String toString() {
//        StringBuilder res = new StringBuilder(SIZE);
//        for (boolean b : array)
//            res.append(b ? '1' : 0);
//        return res.toString();


        char[] res = new char[SIZE];
        for (int i = 0; i< SIZE; i++)
            res[i] = array[i] ? '1' : '0';
        return new String(res);


    }


}
