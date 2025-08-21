package com.mypuzzles;

import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<List<String>> lists = List.of(List.of("a", "b", "c"), List.of("d", "e", "f")); //This creates a list of lists: [["a", "b", "c"], ["d", "e", "f"]].
        System.out.println(lists.stream()
                .flatMap(list -> list.stream())
                .peek(System.out::println)
                .anyMatch(s -> s.equals("b")));
    }
}
