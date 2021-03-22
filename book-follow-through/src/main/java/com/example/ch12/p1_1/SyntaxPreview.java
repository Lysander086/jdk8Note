package com.example.ch12.p1_1;

import java.util.Arrays;
import java.util.Comparator;

public class SyntaxPreview {
    public static void main(String[] args) {
        final String[] names = {"Justin", "caterpillar", "Bush"};
       // int a = 1;
        Comparator<String> byLength = (String name1, String name2) -> {
           // a += 1;
            return name1.length() - name2.length();
        };

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }
}
