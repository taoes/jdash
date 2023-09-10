package com.idevkit.lib.jdash.str;

public class Strings {

    public final static String EMPTY = "";


    /**
     * 判断字符串是否是空字符串
     *
     * @param str
     * @return
     * @since 1.0
     */
    public static boolean empty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean notEmpty(String str) {
        return !empty(str);
    }

    public static boolean blank(String str) {
        if (empty(str)) {
            return true;
        }

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (!Character.isWhitespace(aChar)) {
                return false;
            }
        }

        return true;
    }

    public static boolean notBlank(String str) {
        return !blank(str);
    }


    /**
     * 转换字符串为驼峰写法
     *
     * @param str
     * @return
     * @apiNote https://en.wikipedia.org/wiki/CamelCase
     */
    public static String cameCase(String str) {
        return "";
    }


    public static String upperCaseFirst(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    public static String lowerCaseFirst(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        return str.substring(0, 1).toLowerCase() + str.substring(1, str.length());
    }


    public static String upperCase(String str) {
        return blank(str) ? str : str.toUpperCase();
    }

    public static String lowerCase(String str) {
        return blank(str) ? str : str.toLowerCase();
    }

    public static boolean endWith(String str, String endStr) {
        if (str == null || str.length() == 0) {
            return false;
        }

        return str.endsWith(endStr);
    }

    public static String padStart(String str, int length, char fillChar) {
        int strLen = str.length();
        if (strLen >= length) {
            return str;
        }

        final char[] chars = new char[length];
        for (int i = 0; i < strLen; i++) {
            chars[i] = str.charAt(i);
        }

        for (int i = strLen; i < length; i++) {
            chars[i] = fillChar;
        }

        return String.valueOf(chars);
    }

    public static String padEnd(String str, int length, char fillChar) {
        int strLen = str.length();
        if (strLen >= length) {
            return str;
        }

        final char[] chars = new char[length];
        for (int i = 0; i < length - strLen; i++) {
            chars[i] = fillChar;
        }


        for (int i = length - strLen; i < length; i++) {
            chars[i] = str.charAt(i - (length - strLen));
        }


        return String.valueOf(chars);


    }

    public static String repeat(String str, int repeatCount) {
        if (empty(str)) {
            return str;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            builder.append(str);
        }
        return builder.toString();
    }

    public static String trim(String str, char ch) {
        if (blank(str)) {
            return EMPTY;
        }
        return null;
    }

    public static String trimWhiteChar(String str) {
        return null;
    }
}
