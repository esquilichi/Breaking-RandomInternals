package com.urjc.randominternals;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(RandomStringUtils.randomAlphanumeric(10));
        }
    }
}
