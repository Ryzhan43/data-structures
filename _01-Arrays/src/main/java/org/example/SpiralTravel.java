package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralTravel {

    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
            spiritialTravel(matrix).forEach(System.out::println);
    }

    private static List<Integer> spiritialTravel(int[][] matrix) {
        if (matrix.length == 0) return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int col = startCol; col <= endCol; col++){
                result.add(matrix[startRow][col]);
            }

            for(int row = startRow + 1; row <= endRow; row++){
                result.add(matrix[row][endCol]);
            }

            for(int col = endCol - 1; col >= startCol; col--){
                result.add(matrix[endRow][col]);
            }


            for(int row = startRow + 1; row <= startRow; row--){
                result.add(matrix[row][startCol]);
            }


            startRow++;endCol--;startCol++;endRow--;
        }

        return result;
    }
}
