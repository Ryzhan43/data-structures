package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {


    public static void main(String[] args) {

        int[] myarray ={2,7,9,11};

        System.out.println("Optimal solution ......");
        System.out.println(Arrays.toString(twoSum(myarray, 9)));
        System.out.println("Two Pointer Solution ....");
        System.out.println(Arrays.toString(twoSum2(myarray, 9)));
    }


    // Optimal solution O(n)
    public static int[] twoSum(int[] array, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<array.length; i++){
            if(map.containsKey(target - array[i]))
                return new int[]{map.get(target-array[i]), i };
            else map.put(array[i],i);
        }
        return new int[]{0,0};
    }

    public static int[] twoSum2(int[] array, int target){
        Arrays.sort(array);

        int i = 0;
        int j = array.length-1;
        while (i < j){
            int sum = array[i]+array[j];
            if(sum==target) return new int[]{i,j};
            else if(sum<target) i++;
            else j--;
        }
        return new int[]{0,0};
    }
}
