package com.idevkit.lib.obj;

/**
 * 范围容器
 */
public class Range<E extends Comparable<E>> {

    private final E start;

    private final E end;

    private Range(E start, E end) {
        this.start = start;
        this.end = end;
    }

    // public static <E> Range<E> of(E start, E end) {
    //     return new Range<>(start, end);
    // }

    // public static <E> Range<E> ofStart(E start) {
    //     return new Range<>(start, null);
    // }

    // public static <E> Range<E> ofEnd(E end) {
    //     return new Range<>(null, end);
    // }

    public boolean hasStart() {
        return this.start != null;
    }

    public boolean hasEnd() {
        return this.end != null;
    }

    /**
     * 区间是否封闭
     * @return
     */
    public boolean seal(){
        return this.hasStart() && this.hasEnd();
    }
}
