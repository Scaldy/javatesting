package org.platzi.javatests.util;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class DateUtilLeapYearShould {
    /*
    Para determinar si un año es bisiesto o no, debemos seguir las siguientes reglas:

    Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
    Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
    Todos los años divisibles por 4 son bisiestos (1996, 2004, 2012)
    Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
     */

    @Test
    public void return_true_when_is_divisible_by_400() {
        assertThat(DateUtil.isLeapYear(1200), is(true));
        assertThat(DateUtil.isLeapYear(1600), is(true));
        assertThat(DateUtil.isLeapYear(2000), is(true));
        assertThat(DateUtil.isLeapYear(2400), is(true));
    }

    @Test
    public void return_false_when_is_divisible_by_100_but_not_by_400() {
        assertThat(DateUtil.isLeapYear(1500), is(false));
        assertThat(DateUtil.isLeapYear(1700), is(false));
        assertThat(DateUtil.isLeapYear(1900), is(false));
    }

    @Test
    public void return_true_when_is_divisible_by_4_but_not_by_100() {
        assertThat(DateUtil.isLeapYear(1976), is(true));
        assertThat(DateUtil.isLeapYear(2004), is(true));
        assertThat(DateUtil.isLeapYear(2020), is(true));
    }

    @Test
    public void return_false_when_not_is_divisible_by_4() {
        assertThat(DateUtil.isLeapYear(1977), is(false));
        assertThat(DateUtil.isLeapYear(2003), is(false));
        assertThat(DateUtil.isLeapYear(2022), is(false));
    }
}