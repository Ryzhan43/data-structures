package org.example;

public class BinarySearch {
    public static int binarySearchIterative(int[] array, int data){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(array[middle]==data) return middle;
            if(data<array[middle]) return middle;
            else left=middle+1;
        }
        return -1;
    }
}
