package com.example.ch12.p1_4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ConstructorReference {
    static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {

        List<R> mappedList = new ArrayList<>();

        for (T t : list) {
            mappedList.add(mapper.apply(t));
        }

        return mappedList;
    }

    public static void main(String[] args) {


    }
}
