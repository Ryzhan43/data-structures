package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Assignment5SunSetView {
    public static void main(String[] args) {
        int[] buildings = {3,5,4,4,3,1,3,2};
        sunsetView(buildings, "EAST").forEach(System.out::println);
    }

    private static ArrayList<Integer> sunsetView(int[] buildings, String direction) {
        Stack<Integer> candidateBuildings=new Stack<>();
        int startIdx=0;
        int step = 1;

        if(direction.equals("WEST")){startIdx=buildings.length-1;step=-1;}
        int idx=startIdx;

        while (idx>=0 && idx<buildings.length){
            while (!candidateBuildings.isEmpty() && buildings[candidateBuildings.peek()]<=buildings[idx]){
                candidateBuildings.pop();
            }
            candidateBuildings.push(idx);
            idx+=step;
        }

        Collections.reverse(candidateBuildings);
        return new ArrayList<Integer>(candidateBuildings);
    }
}
