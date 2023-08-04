package org.example;

public class LinearSearch {
    public int leanerSearch(int[] arr, int data){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==data) return arr[i];
        }
        return -1;
    }
}
