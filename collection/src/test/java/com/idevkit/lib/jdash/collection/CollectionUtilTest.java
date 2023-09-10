package com.idevkit.lib.jdash.collection;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionUtilTest {

    @org.junit.Test
    public void empty() {
        Assert.assertFalse(CollectionUtil.empty(Arrays.asList(1)));
        Assert.assertTrue(CollectionUtil.empty(Collections.emptyList()));
        Assert.assertTrue(CollectionUtil.empty(Collections.emptyMap()));
        Assert.assertTrue(CollectionUtil.empty(Collections.emptySet()));
        Assert.assertTrue(CollectionUtil.empty(Collections.emptySet()));
    }

    @org.junit.Test
    public void foreach() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> doubleNumber = new ArrayList<>();
        CollectionUtil.foreach(integers, (number) -> {
            doubleNumber.add(number * 2);
        });
        for (int i = 0; i < integers.size(); i++) {
            Assert.assertEquals(integers.get(i) * 2, (int) doubleNumber.get(i));
        }
        Assert.assertEquals(doubleNumber.size(), integers.size());

    }


    @Test
    public void foreachRight() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> doubleNumber = new ArrayList<>();
        CollectionUtil.foreachRight(integers, (number) -> {
            doubleNumber.add(number * 2);
        });
        for (int i = 0; i < integers.size(); i++) {
            Assert.assertEquals(integers.get(i) * 2, (int) doubleNumber.get(integers.size() - i - 1));
        }
        Assert.assertEquals(doubleNumber.size(), integers.size());
    }

    @Test
    public void every() {
        List<Integer> notNullElement = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertTrue(CollectionUtil.every(notNullElement, Objects::nonNull));


        List<Integer> nullElement = Arrays.asList(null, null);
        Assert.assertTrue(CollectionUtil.every(nullElement, Objects::isNull));


        List<Integer> doubleNumberElement = Arrays.asList(2, 4, 6, 8, 0);
        Assert.assertTrue(CollectionUtil.every(doubleNumberElement, number -> number % 2 == 0));


        doubleNumberElement = Arrays.asList(2, 4, 6, 9, 0);
        Assert.assertFalse(CollectionUtil.every(doubleNumberElement, number -> number % 2 == 0));


    }
}
