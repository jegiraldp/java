package com.jegiraldp.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void testRepeat_once() {
       Assert.assertEquals("jorge", StringUtil.repeat("jorge", 1));
    }

    @Test
    public void testRepeat_multiple_times() {
       Assert.assertEquals("jorgejorgejorge", StringUtil.repeat("jorge", 3));
    }

    @Test
    public void testRepeat_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("jorge", 0));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testRepeat_negative() {
        StringUtil.repeat("jorge", -3);
    }

    @Test
    public void testRepeat_negative2(){
        assertThrows(IllegalArgumentException.class, () -> StringUtil.repeat("jorge", -1));
    }

}