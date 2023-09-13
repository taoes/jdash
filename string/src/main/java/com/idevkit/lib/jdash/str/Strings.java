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

    /**
     * 判断字符串是够不是空字符串
     * 
     * @since 1.0-beta
     */
    public static boolean notEmpty(String str) {
        return !empty(str);
    }

    /**
     * 判断字符串是否是空白字符串
     * 
     * @since 1.0-beta
     */
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

    /**
     * 判断字符串是否不是空白字符串
     * 
     * @since 1.0-beta
     */
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
        if (blank(str)) {
            return str;
        }

        char[] chs = str.toCharArray();
        return "";
    }

    /**
     * 将给定的字符串首字母大写
     * 
     * @since 1.0-beta
     */
    public static String upperCaseFirst(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
    }

    /**
     * 将给定的字符串首字母小写
     * 
     * @since 1.0-beta
     */
    public static String lowerCaseFirst(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        return str.substring(0, 1).toLowerCase() + str.substring(1, str.length());
    }

    /**
     * 将给定的字符串大写
     * 
     * @since 1.0-beta
     */
    public static String upperCase(String str) {
        return blank(str) ? str : str.toUpperCase();
    }

    /**
     * 将给定的字符串小写
     * 
     * @since 1.0-beta
     */
    public static String lowerCase(String str) {
        return blank(str) ? str : str.toLowerCase();
    }

    /**
     * 判断字符串是否以制定字符串结尾
     * 
     * @since 1.0-beta
     */
    public static boolean endWith(String str, String endStr) {
        if (str == null || str.length() == 0) {
            return false;
        }

        return str.endsWith(endStr);
    }

    /**
     * 当字符串长度不满足要求的时候，在开头填充制定字符
     */
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

    /**
     * 当字符串长度不满足要求的时候，在结尾填充制定字符
     */
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

    /**
     * 重复字符串
     */
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

    /**
     * 移除字符串首尾的字符
     */
    public static String trim(String str, char ch) {
        if (blank(str)) {
            return EMPTY;
        }
        return null;
    }

    /**
     * 移除字符串首尾的空白字符
     */
    public static String trimWhiteChar(String str) {
        return null;
    }
}
