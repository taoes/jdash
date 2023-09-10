package com.idevkit.lib.jdash.str;

import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

    @org.junit.Test
    public void cameCase() {
    }

    @org.junit.Test
    public void upperCaseFirst() {
        String example = "abc";
        Assert.assertEquals(Strings.upperCaseFirst(example), "Abc");

        example = "123";
        Assert.assertEquals(Strings.upperCaseFirst(example), "123");


        example = "Some";
        Assert.assertEquals(Strings.upperCaseFirst(example), "Some");

        example = "__a";
        Assert.assertEquals(Strings.upperCaseFirst(example), "__a");
    }

    @org.junit.Test
    public void lowerCaseFirst() {
        String example = "Abc";
        Assert.assertEquals(Strings.lowerCaseFirst(example), "abc");

        example = "123";
        Assert.assertEquals(Strings.lowerCaseFirst(example), "123");


        example = "some";
        Assert.assertEquals(Strings.lowerCaseFirst(example), "some");

        example = "__a";
        Assert.assertEquals(Strings.lowerCaseFirst(example), "__a");
    }

    @Test
    public void empty() {
        Assert.assertTrue(Strings.empty(""));
        Assert.assertFalse(Strings.empty("example"));
        Assert.assertFalse(Strings.empty("_example"));
        Assert.assertFalse(Strings.empty("_"));
        Assert.assertFalse(Strings.empty(" "));
    }


    @Test
    public void blank() {
        Assert.assertTrue(Strings.blank(""));
        Assert.assertTrue(Strings.blank(" "));
        Assert.assertTrue(Strings.blank("   "));


        Assert.assertFalse(Strings.blank("example"));
        Assert.assertFalse(Strings.blank("_example"));
        Assert.assertFalse(Strings.blank("_"));
        Assert.assertFalse(Strings.blank("-"));
        Assert.assertFalse(Strings.blank("@"));
        Assert.assertFalse(Strings.blank("\u0034"));

    }


    @Test
    public void endWith() {
        Assert.assertTrue(Strings.endWith("123", "3"));
        Assert.assertFalse(Strings.endWith(null, "3"));
        Assert.assertFalse(Strings.endWith("123", "4"));
    }

    @Test
    public void notEmpty() {
    }

    @Test
    public void notBlank() {
    }

    @Test
    public void padStart() {
        String example = "123";
        Assert.assertEquals(Strings.padStart(example, 5, '4'), "12344");
        Assert.assertEquals(Strings.padStart(example, 5, ' '), "123  ");
        Assert.assertNotEquals(Strings.padStart(example, 5, '4'), "12345");
        Assert.assertEquals(Strings.padStart(example, 3, ' '), example);
        Assert.assertEquals(Strings.padStart(example, 2, ' '), example);
    }

    @Test
    public void padEnd() {
        String example = "123";
        Assert.assertEquals(Strings.padEnd(example, 5, '4'), "44123");
        Assert.assertEquals(Strings.padEnd(example, 5, ' '), "  123");
        Assert.assertNotEquals(Strings.padEnd(example, 5, '4'), "54123");
        Assert.assertEquals(Strings.padEnd(example, 3, ' '), example);
        Assert.assertEquals(Strings.padEnd(example, 2, ' '), example);
    }

    @Test
    public void repeat() {
        String example = "123";
        Assert.assertEquals(Strings.repeat(example, 5), "123123123123123");
        Assert.assertEquals(Strings.repeat(example, 0), "");
        Assert.assertEquals(Strings.repeat(example, 1), example);
    }

    @Test
    public void upperCase() {
        String example = "abc";
        Assert.assertEquals(Strings.upperCase(example), "ABC");
        Assert.assertEquals(Strings.upperCase(" "), " ");
    }

    @Test
    public void lowerCase() {
        String example = "ABC";
        Assert.assertEquals(Strings.lowerCase(example), "abc");
        Assert.assertEquals(Strings.lowerCase(" "), " ");
    }
}