package com.example.ch12.p1_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.lang.System.out;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
}

public class MethodReferenceDemo {
    static <P, R> List<R> map(List<P> list, Function<P, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            mapped.add(mapper.apply(list.get(i)));
        }
        return mapped;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tony", "Go go", "Jenny");
        List<Person> persons = map(names, Person::new);
        persons.forEach(out::println);
    }
}
