package com.liamhayes;

import java.util.ArrayList;
import java.util.List;

public class TestLoops {

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("five");

        s.forEach(i -> System.out.println(i));
        s.clear();
        System.out.println(s.size());
    }


}
