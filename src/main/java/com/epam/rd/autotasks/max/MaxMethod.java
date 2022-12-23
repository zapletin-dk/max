package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maxVa = values[0];
        for (int var : values) {
            if (var>maxVa){
                maxVa = var;
            }
        }
        return maxVa;
    }
}


