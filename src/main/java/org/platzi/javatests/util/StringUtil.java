package org.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int times){
        String result = "";

        // Shortcut fori en IJ
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
