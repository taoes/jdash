package com.idevkit.lib.obj;

public class Objects {

    private Objects() {
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean notNull(Object obj) {
        return obj != null;
    }

    public static boolean equals(Object o1, Object o2) {
        return o1 == o2 || (o1 != null && o1.equals(o2));
    }

}