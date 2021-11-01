package com.ness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main101 {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList(
             "N1", "N2",
             "B32", "B31", "b41"
        );

//        List<String> bNumbers = new ArrayList<>();
//
//        numbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("B")) {
//                bNumbers.add(number);
//               // System.out.println(number);
//            }
//        });
//
//        bNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        bNumbers.forEach((String s) -> System.out.println(s));

        numbers.stream().map(String::toUpperCase)
                .filter(s ->s.startsWith("B")).sorted().forEach(System.out::println);

    }

}
