package ru.avalon.java.test;

import org.junit.Assert;
import org.junit.Test;
import ru.avalon.java.main.ArrayBitSet;
import ru.avalon.java.main.ArrayBitSet2;


public class Main {


    @Test
    public void testCheck() {
        ArrayBitSet abs = new ArrayBitSet();
        ArrayBitSet2 abs2 = new ArrayBitSet2();
        Assert.assertEquals(abs2.check(0), abs.check(0));
        abs.set(0);
        abs2.set(0);
        Assert.assertEquals(abs2.check(0), abs.check(0));
        abs.clear(0);
        abs2.clear(0);
        Assert.assertEquals(abs2.check(0), abs.check(0));
        abs.invert(0);
        abs2.invert(0);
        Assert.assertEquals(abs2.check(0), abs.check(0));
        abs.count();
        abs2.count();
        Assert.assertEquals(abs2.check(0), abs.check(0));

    }

    @Test
    public void testCheckFirst() {
        ArrayBitSet abs = new ArrayBitSet(); //создается переменная check и новый объект ArrayBitSet
        Assert.assertEquals(false, abs.check(0));  //проверил у объекта 0й индекс, 1й элем нулевой
        abs.set(0);                                              //1й элем устаналиваю в true
        Assert.assertEquals(true, abs.check(0));   // проверяю что он правда в true
        abs.clear(0);
        Assert.assertEquals(false, abs.check(0));
        abs.invert(0);
        Assert.assertEquals(abs.check(0), abs.check(0));
    }

    @Test
    public void testCheckSecond() {
        ArrayBitSet2 cde = new ArrayBitSet2();
        Assert.assertEquals(false, cde.check(0));
        cde.set(0);
        Assert.assertEquals(true, cde.check(0));
        cde.clear(0);
        Assert.assertEquals(false, cde.check(0));
        cde.invert(0);
        Assert.assertEquals(cde.check(0), cde.check(0));
    }

}
