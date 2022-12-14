package org.platzi.javatests.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    // Shortcut psvm

    @Test
    public void testRepeat() {
        Assert.assertEquals( "HolaHolaHola", StringUtil.repeat("Hola", 3));

        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    /*
    @org.junit.Test
    public void repeat() {
    }
     */
}