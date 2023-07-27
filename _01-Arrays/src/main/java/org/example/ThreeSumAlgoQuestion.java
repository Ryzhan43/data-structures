package org.example;

import java.util.*;

public class ThreeSumAlgoQuestion {

    public static void main(String[] args) {
        int[] array = {12,3,1,2,-6,5,-8,6};
        Arrays.sort(array);

//        System.out.println(Arrays.toString(array));
        ThreeSum(array, 0).stream().forEach(a -> System.out.println(Arrays.toString(a)));

    }

    public static List<int[]> ThreeSum(int[] array, int target){

        int j=1;
        int k=2;
        List<int[]> arrayList = new ArrayList<>();

//        for (int i = 0; i<array.length-1; i++){
//            int sum = (array[i] +  array[j] + array[k]);
//            if(sum == target) return new int[]{array[i],array[j],array[k]};
//            if(j != k-1) {j++; --i;}
////            if(j != k-1) {j++; i=i!=0?i--:i;}
//            else if(k!=array.length-1 && k == j+1) {k++; --i;}
//            if(k==array.length-1 && j == array.length-2) {j=i+1;}
//        }

        for (int i = 0; i < array.length-1; i++) {
            while ( j < k) {
                if((array[i] +  array[j] + array[k]) == target) arrayList.add(new int[] {array[i],array[k],array[j]});
                System.out.println("i = " + i + " j = " + j + " k = " + k);
                j++;
            }
            j=i ;
            if(k != array.length-1) {
                k++;
                --i;
            }

        }
        return arrayList;
    }


    public static List<List<Integer>> threeNumberSum1(int[] array, int targetSum){
        // Overall complexity nlogn+ n X n = n
        Arrays.sort(array);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i<array.length-2; i++){
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[right] + array[left];
                if(currentSum == targetSum) {
                    triplets.add(Arrays.asList(array[i],array[left],array[right]));
                    left++;
                    right--;
                 } else if (currentSum < targetSum) left++;
                else if(currentSum>targetSum) right--;
            }
        }
        return triplets;
    }

    public static List<List<Integer>>  threeNumberSum2(int[] array, int targetSum){
        Set<List<Integer>> resault = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(array);

        //Put all numbers in a Hashmap
        for(int i = 0; i < array.length;i++){
            map.put(array[i],i);
        }

        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                List<Integer> triplet = new ArrayList<>();
                int potentialMatch = targetSum - array[i] - array[j];
                if(map.containsKey(potentialMatch) && map.get(potentialMatch)>j){
                    triplet.add(array[i]);
                    triplet.add(array[j]);
                    triplet.add(potentialMatch);
                    resault.add(triplet);//set to prevent duplicates
                }

            }
        }
        return new ArrayList(resault);
    }

}
