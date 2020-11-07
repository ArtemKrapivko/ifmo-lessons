package ru.avalon.java.main;

public class ArrayBitSet2 implements BitSet2 {
    private int[] array = new int[SIZE / 32];

    @Override
    public boolean check(int index) {
        checkIndexOutOfBound(index);
        return ((array[index / 32] >> index % 32) & 1) == 1;
    }

    @Override
    public void set(int index) {
        set(index, true);
    }


    @Override
    public void set(int index, boolean value) {
        checkIndexOutOfBound(index);
//        if (check(index)==value) {                  //если один.знач, выходим из метода
//            return;
//        } else {
            if (value) {
                array[index / 32] |= (1 << (index % 32));       //true
            } else {
                array[index / 32] &=~ (1 << (index % 32));       //false
            }
//        }
    }

    @Override
    public void clear(int index) {
        set(index, false);

    }

    @Override
    public void invert(int index) {
        checkIndexOutOfBound(index);
        array[index / 32] ^= (1 << (index % 32));

//        if (check(index)) {
//            set(index, false);
//        } else {
//            set(index, true);
//        }
    }

    private void checkIndexOutOfBound(int index) {
        if (index < 0 || index >= SIZE)
            throw new IllegalArgumentException("Index is incorrect");
    }

    @Override
    public int count() {
        int cnt = 0;

        for (int i = 0; i < SIZE; i++) { //пробегает по всем элементам внутри выборки
            if (check(i))
                cnt++;
        }
        return cnt;

    }


//    int cnt = 0;
//        for (int b : array) { // пачки из 32шт, пробегает верхнеуровнево, нужно обработать еще внутри
//        if (check(b))
//            cnt++;
//    }
//        return cnt;
//
//}
//


    @Override
    public String toString() { //выводит конкретное значение, а не хэш код

        char[] res = new char[SIZE];
        for (int i = 0; i < SIZE; i++)
            res[i] = (check(i)) ? '1' : '0';
        return new String(res);


    }


}
