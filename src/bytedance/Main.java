/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: Main.java
 * @author: terryhy520@gmail.com
 * @date: 8/16/21, 8:44 PM
 * @version: 1.0
 */

package bytedance;

/**
 * @Author: Terry
 * @Date: 8/16/2021 8:44 PM
 */
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    private static final Byte lock = 0x00;
    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        Main main = new Main();
        System.out.printf(":"+ main.foo(map, 0, 1));
    }

    public int foo(ConcurrentHashMap map, long key, long value) {
        synchronized (lock) {
            if (map.containsKey(key)) {
                if ((long) map.get(key) == value) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                map.put(key, value);
                return 0;
            }
        }
    }
}