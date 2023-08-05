package org.example;

import java.sql.Time;

public class LinearSearch {
    public static long[] leanerSearch(int[] arr, int data){
        long[] resaults = new long[2];
        long startTime=System.currentTimeMillis();
        int compSum = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==data) {
                resaults[0] = i;
                resaults[1] = System.currentTimeMillis()-startTime;
                return resaults;
            };
            compSum+=1;
        }

        System.out.println("Execution time: " + (startTime) + ", total comparisons: " + compSum);
        return resaults;
    }
}
