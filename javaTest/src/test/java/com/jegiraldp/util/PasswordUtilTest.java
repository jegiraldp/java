package com.jegiraldp.util;

import org.junit.jupiter.api.Test;

import static com.jegiraldp.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.assertEquals;

class PasswordUtilTest {
    @Test
    public void weak_less_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("123t56A"));
    }

    @Test
    public void weak_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcd1234"));
    }


    @Test
    public void strong_letters_and_numbers() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }


}