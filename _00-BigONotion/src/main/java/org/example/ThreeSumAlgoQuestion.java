package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

}
