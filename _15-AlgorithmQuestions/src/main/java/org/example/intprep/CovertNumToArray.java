package org.example.intprep;

public class CovertNumToArray {

    public static void main(String[] args) {
        int[] num = convertPositiveToArray(1235123407);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }
    public static int findIndex(int num) {
        if (num<0) return 0;
        return findIndex(num/10);
    }
    public static int[] convertPositiveToArray(int pos){
        int temp = pos, i =0;
        while(temp >= 1){
            temp/=10;
            i++;
        }

        int[] result =new int[i];
        for (int j = i-1; j >= 0; j--) {
            result[j] = pos%10;
            pos=(pos-result[j])/10;
        }
        return result;
    }
}
