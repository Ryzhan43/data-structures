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
    public static int binarySearchRecursive(int[] array, int data){
        return binarySearchRecursive(array,data,0, array.length-1);
    }
    public static int binarySearchRecursive(int[] array, int data, int left, int right){
        while(right<left){
            int middle=(left+right)/2;
            if(array[middle]==data) return middle;
            if(data<array[middle]) binarySearchRecursive(array, data,left,middle-1);
            else binarySearchRecursive(array, data,middle+1, right);
        }
        return -1;
    }


}
