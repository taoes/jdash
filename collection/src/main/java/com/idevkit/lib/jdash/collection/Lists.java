package com.idevkit.lib.jdash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

    private Lists() {
    }


    public static <E> List<E> empty() {
        return Collections.emptyList();
    }

    public static <E> List<E> of(E e) {
        List<E> result = new ArrayList<>(1);
        result.add(e);
        return result;
    }

    public static <E> List<E> of(E e1, E e2) {
        List<E> result = new ArrayList<>(2);
        result.add(e1);
        result.add(e2);
        return result;
    }

    public static <E> List<E> of(E e1, E e2, E e3) {
        List<E> result = new ArrayList<>(3);
        result.add(e1);
        result.add(e2);
        result.add(e3);
        return result;
    }
}
