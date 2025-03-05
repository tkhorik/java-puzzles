package com.mypuzzles;

public class GoInvestTech {
////    Задача 1
//
////    Что выведется на консоль? Написать ответ.
//
//    private static void addToList(List<Integer> list) {
//        if (list.get(0) <= 0) {
//            list.add(456);
//        } else {
//            list = new ArrayList<>();
//        }
//    }
//
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(123);
//        addToList(list);
//        System.out.println(list);
//    }
//    /*
//
//    Задача 2
//
//    Что выведется на консоль? Написать ответ.
//
//    */
//    Stream<Integer> mainStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
//    List<Integer> listOdd = mainStream.filter(item -> item % 2 == 0).collect(toList());
//        System.out.println(listOdd);
//
//    List<Integer> listEven = mainStream.filter(item -> item % 2 != 0).collect(toList());
//        System.out.println(listEven);
///*
//
//Задача 3
//
//Что выведется на консоль? Написать ответ.
//
//*/
//
//Stream.of("d2", "a2", "b1", "b3", "c")
//        .map(s -> {
//        System.out.println("map: " + s);
//        return s.toUpperCase();
//    })
//            .anyMatch(s -> {
//        System.out.println("anyMatch: " + s);
//        return s.startsWith("A");
//    });
//
///*
//Задача 4
//
//В каком варианте массив будет успешно отсортирован: (от 0 до 3 вариантов)
//
//*/
//
//    String strings[] = {"u", "z", "c", "d", "a", "b"};
//
//       1.)    List<String> list = new ArrayList<>(strings);
//       2.)    List<String> list = Arrays.asList(strings);
//       3.)    List<String> list = List.of(strings);
//
//Collections.sort(list);
//
///*
//Задача 5
//
//Проанализируй код
//*/
//
//    List<String> results = integers.stream()
//            .map(integer -> integer * 500)
//            .map(integer -> CompletableFuture.supplyAsync(()->process(integer), executor))
//            .map(CompletableFuture::join)
//            .collect(Collectors.toList());
}
