package org.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.platzi.javatests.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    // Shortcut Ctrl + Enter
    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghi"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcdefghi123"));
    }

    @Test
    public void strong_when_has_letters_and_numbers_and_symbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcdefghi123!"));
    }
}