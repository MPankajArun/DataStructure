package com.ArrayAndStrings;

import java.util.Arrays;

/**
 * Created by Pankaj Arun Meshram on 27/12/16.
 */
public class ZeroMatrix {
    public static void zero(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        // store row and colunm index to 0
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // set mat[i][j] to 0 if either row or column has 0
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(row[i] == 1 || col[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 1, 1, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
        zero(matrix);
        System.out.println();
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));

    }
}
