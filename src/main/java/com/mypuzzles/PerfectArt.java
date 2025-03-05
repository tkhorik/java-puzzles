package com.mypuzzles;

import org.w3c.dom.ls.LSOutput;

public class PerfectArt {
    //            Java:
//            - что вернется в каждом случае и почему?
    public static void main(String[] args) {
        System.out.println("Hello мир".length());
        System.out.println("Hello мир".getBytes().length);

        //- что выведет консоль?
        String a1 = "a";
        String a2 = "а";
        String a3 = new String("а");

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
//            - какие значения может принимать integer?
//            - как создать immutable класс у которого одно из полей типа List?
//            - какие есть полезные инструменты в concurrent пакете?
//            - для чего нужeн ExecutorService?
//            - внутренняя реализация атомиков?
//            - что такое happens before?
//            - какие интерфейсы и классы есть в Collections?
//            - как работает HashMap?
//            - что такое лямбды, для чего нужны и как используются?
//            - как работают стримы?
//            - устройство памяти JVM?
//            - как работает GC?
    }
}
