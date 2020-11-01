package ru.avalon.java.main;

public interface BitSet2 {
    int SIZE = 1024;

    boolean check(int index);

    void set(int index);

    void set(int index, boolean value);

    void clear(int index);

    void invert(int index);

    int count();

    @Override
    String toString();


}
