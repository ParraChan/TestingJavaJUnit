package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }
    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
    }
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("",StringUtil.repeat("hola",0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola",-1);
    }

    @Test
    public void repeat_string_negative_times2() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("hola", -1);
        });
    }
    @Test
    public void empty_is_false(){
        assertFalse(StringUtil.isEmpty("Ruben"));
    }

    @Test
    public void Empty_quotationMarks(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void Empty_space(){
        String str = new String(" ");
        assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void empty_null(){
        assertTrue(StringUtil.isEmpty(null));
    }


}