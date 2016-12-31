package com.ArrayAndStrings;

import java.util.Arrays;

/**
 * Created by Pankaj Arun Meshram on 27/12/16.
 */
public class RotateImage {
    public static void main(String[] args) {
        int mat[][] = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        rotate(mat);
        for(int[] a: mat)
            System.out.println(Arrays.toString(a));
    }

    public static void rotate(int[][] mat){
        int size = mat.length;

        for(int layer = 0;layer < size/2;layer++){
            int firstLayer = layer;
            int lastLayer = size - 1 - layer;
            for(int i = firstLayer;i<lastLayer;i++){
                int offset = i - firstLayer;
                int top = mat[firstLayer][i];

                //left -> Top
                mat[firstLayer][i] = mat[lastLayer-offset][firstLayer];

                //bottom -> Left
                mat[lastLayer-offset][firstLayer] = mat[lastLayer][lastLayer-offset];

                //right -> bottom
                mat[lastLayer][lastLayer-offset] = mat[i][lastLayer];

                //top -> right
                mat[i][lastLayer] = top;
            }
        }
    }
}
