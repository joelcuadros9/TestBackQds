package com.qds.testback.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class MatrizService {

    public ArrayList<int[]> reverseMatriz(ArrayList<int[]> matriz) {
        ArrayList<int[]> reverse = new ArrayList<int[]>();
        int[] numbers;
        int[] numbersReverse;
        for (int i = 0; i < matriz.size(); i++) {
            numbersReverse = new int[0];
            for (int j = matriz.get(i).length -1; j >= 0; j--) {
                numbers = matriz.get(i);
                numbersReverse = addElement(numbersReverse, numbers[j]);

            }
            reverse.add(numbersReverse);
        }
        return reverse;
    }

    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
}
