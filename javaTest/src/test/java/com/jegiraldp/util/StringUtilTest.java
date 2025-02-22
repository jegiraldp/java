package com.jegiraldp.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

        @Test
        public void testRepeat() {
            Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
            Assert.assertEquals("holahola", StringUtil.repeat("hola", 2));
            System.out.println("Ok");
        }

}