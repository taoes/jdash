package com.idevkit.lib.jdash.collection;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CollectionUtil {

    private CollectionUtil() {
    }


    public static <K, V> boolean empty(Map<K, V> group) {
        return group == null || group.isEmpty();
    }

    public static <E> boolean empty(Collection<E> eList) {
        return eList == null || eList.isEmpty();
    }

    /**
     * 遍历集合
     *
     * @param eList
     * @param consumer
     * @param <E>
     */
    public static <E> void foreach(Collection<E> eList, Consumer<E> consumer) {
        if (empty(eList)) {
            return;
        }


        for (E e : eList) {
            consumer.accept(e);
        }
    }


    public static <E> void foreachRight(Collection<E> eList, Consumer<E> consumer) {
        if (empty(eList)) {
            return;
        }

        Iterator<E> iterator = eList.iterator();
        Stack<E> stack = new Stack<>();
        while (iterator.hasNext()) {
            stack.push(iterator.next());
        }

        while (!stack.empty()) {
            consumer.accept(stack.pop());
        }
    }

    public static <E> boolean every(Collection<E> eList, Predicate<E> predicate) {
        if (empty(eList)) {
            return true;
        }


        for (E e : eList) {
            boolean test = predicate.test(e);
            if (!test) {
                return false;
            }
        }

        return true;


    }
}
