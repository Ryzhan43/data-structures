package org.example;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,5,1,2};
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        mergerSort(array);
        Arrays.stream(array).forEach(System.out::print);
    }
    public static void mergerSort(int[] array){
        if(array.length<2) return;
        int mid=array.length/2;
        int[] rightArray = new int[array.length-mid];
        int[] leftArray = new int[mid];
        for (int i = 0; i < mid; i++) {
            leftArray[i]=array[i];
        }
        for (int i = mid; i < array.length; i++) {
            rightArray[i-mid]=array[i];
        }
        mergerSort(leftArray);
        mergerSort(rightArray);
        mergeArrays(rightArray,leftArray,array);
    }

    private static void mergeArrays(int[] rightArray, int[] leftArray, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) result[k++] = leftArray[i++];
            else result[k++] = rightArray[j++];
        }
        while (i < leftArray.length) result[k++] = leftArray[i++];
        while (j < rightArray.length) result[k++] = rightArray[j++];
    }
}
