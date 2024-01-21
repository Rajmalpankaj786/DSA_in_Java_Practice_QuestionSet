package com.DSA.ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroToEndArrayList {
    
    public static void moveZeroToendAnArrayList(List<Integer> list) {
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0 && list.get(j) == 0) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
            if (list.get(j) != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(3);

        moveZeroToendAnArrayList(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

