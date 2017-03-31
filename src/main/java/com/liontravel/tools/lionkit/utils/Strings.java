package com.liontravel.tools.lionkit.utils;

/**
 * Created by neocheng on 2017/3/8.
 */

public class Strings {

    public static boolean isNullOrEmpty(String string) {
        return string == null || string.length() == 0; // string.isEmpty() in Java 6
    }

}
