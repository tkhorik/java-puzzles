package com.mypuzzles;

import java.util.ArrayList;
import java.util.List;

// вернуть список интов не содердащие null and num
public class Intervew {
    public List<Integer> removeNumberFromList(List<Integer> integers, Integer num) {
        List<Integer> listForReturn = new ArrayList<>();

        for (Integer i : integers) {
            if (i != null && !(i.equals(num))) {
                listForReturn.add(i);
            }
        }
        return listForReturn;
    }

    public static void main(String[] args) {

    }
}
