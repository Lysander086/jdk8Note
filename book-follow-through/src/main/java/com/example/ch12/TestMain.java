package com.example.ch12;

import java.util.Comparator;

public class TestMain {
    public static void main(String[] args) {
        new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

    }
}
