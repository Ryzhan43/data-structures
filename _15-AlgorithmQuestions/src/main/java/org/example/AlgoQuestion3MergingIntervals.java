package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AlgoQuestion3MergingIntervals {

    public static void main(String[] args) {

    }

    public static int[][] mergeIntervals(int[][] intervals){
        int[][] sortedIntervals=intervals.clone();
        Arrays.sort(sortedIntervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals=new ArrayList<>();
        int[] currentInterval=sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        for (int[] nextInterval:sortedIntervals){
            int currentIntervalEnd=currentInterval[1];
            int nextIntervalStart=nextInterval[0];
            int nextIntervalEnd=nextInterval[1];

            if(currentIntervalEnd>=nextIntervalStart){
                currentInterval[1]= Math.max(currentIntervalEnd, nextIntervalEnd);
            }else {
                currentInterval=nextInterval;
                mergedIntervals.add(currentInterval);
            }

        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
