package me.twoleggedcat.whatthejava;

public class WhatTheJava {
    public static final String[] defaults = {
            "java.vm.name",
            "java.version",
            "java.vendor",
            "java.vendor.url",
            "java.class.version",
            "java.runtime.version",
            "java.home",
            "os.name",
            "os.version",
            "os.arch",
            "user.language",
        };

    public static void main(String[] args) {
        for (String key : defaults)
            System.out.println(key + ": " + System.getProperty(key));
        for (String key : args)
            // Yes, the :: is intentional
            System.out.println(key + ":: " + System.getProperty(key));
    }
}
