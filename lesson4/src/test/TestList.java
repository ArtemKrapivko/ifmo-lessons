package test;

import org.junit.Assert;
import org.junit.Test;
import v1.MyList;

public class TestList {
    @Test
    public void testAddByIndex() {
        MyList myList = new MyList();
        Assert.assertEquals(0, myList.size());
        myList.addByIndex(1, 0);
        Assert.assertEquals(1, myList.size());
        myList.addByIndex(2, 1);
        Assert.assertEquals(2, myList.size());
    }

    @Test
    public void testGet() {
        MyList myList = new MyList();
        myList.addByIndex(1, 0);
        Assert.assertEquals(1, myList.getByIndex(0));
        myList.addByIndex(2, 0);
        Assert.assertEquals(1, myList.getByIndex(0));
        Assert.assertEquals(2, myList.getByIndex(1));

        myList.addByIndex(3, 0);
        Assert.assertEquals(3, myList.getByIndex(1));
        Assert.assertEquals(1, myList.getByIndex(0));
        Assert.assertEquals(2, myList.getByIndex(2));
    }

    @Test
    public void testRemove() {
        MyList myList = new MyList();
//        myList.addByIndex(1, 0);
//        myList.remove(1);
//        Assert.assertEquals(0, myList.size());
//
//        myList.addByIndex(1, 0);
//        myList.addByIndex(2, 1);
//        Assert.assertEquals(2, myList.size());
//        myList.remove(1);
//        Assert.assertEquals(1, myList.size());
//        Assert.assertEquals(2, myList.getByIndex(0));

        myList.addByIndex(1, 0);
        myList.addByIndex(2, 1);
        myList.addByIndex(3, 2);
        myList.remove(2);
        Assert.assertEquals(2, myList.size());
        Assert.assertEquals(1, myList.getByIndex(0));
        Assert.assertEquals(3, myList.getByIndex(1));
    }
}
