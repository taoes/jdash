package com.idevkit.lib.jdash.collection;

import java.util.HashSet;
import java.util.Collections;
import java.util.Set;

public class Sets {

    private Sets() {
    }


    public static <E> Set<E> empty() {
        return Collections.emptySet();
    }

    public static <E> Set<E> of(E e) {
        Set<E> result = new HashSet<>(1);
        result.add(e);
        return result;
    }

    public static <E> Set<E> of(E e1, E e2) {
        Set<E> result = new HashSet<>(2);
        result.add(e1);
        result.add(e2);
        return result;
    }

    public static <E> Set<E> of(E e1, E e2, E e3) {
        Set<E> result = new HashSet<>(3);
        result.add(e1);
        result.add(e2);
        result.add(e3);
        return result;
    }
}
