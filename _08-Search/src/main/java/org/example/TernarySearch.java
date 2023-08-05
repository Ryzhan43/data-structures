package org.example;

public class TernarySearch {

    public static void main(String[] args) {

    }
    public  static int ternarySearchRecursion(int[] array, int data, int left, int right){
        if(right<left) return -1;
        int partition=(right-left)/3;
        int middle1=left+partition;
        int middle2=right-partition;

        if(array[middle1]==data) return middle1;
        if(array[middle2]==data) return middle2;

        if(data<array[middle1]) ternarySearchRecursion(array, data, left, middle1-1);
        if(data<array[middle1]) ternarySearchRecursion(array, data, middle2+1,right);
        return ternarySearchRecursion(array,data,middle1+1, middle2-1);
    }

    public static int ternarySearchIterative(int[] array, int data){
        int left=0;
        int right=array.length-1;
        while (right>=left){
            int partition=(right-left)/3;
            int middle1=left+partition;
            int middle2=right-partition;

            if(array[middle1]==data) return middle1;
            if(array[middle2]==data) return middle2;
            if(data < array[middle1]) right=middle1+1;
            else if(data>array[middle2]) left=middle2+1;
            else {
                left=middle1+1;
                right=middle2-1;
            }
        }
        return -1;
    }

}
