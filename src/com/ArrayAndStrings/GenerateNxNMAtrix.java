package com.ArrayAndStrings;

/**
 * Created by Pankaj Arun Meshram on 31/12/16.
 *
 *  Random generate a NxN matrix with only four types of element: 1,2,3,4.
    However, no column or row can have same type of element appears 3 times or above continuously (three same type of elements are connected)

    ex:

     valid:
     1 2 1 1
     3 1 4 2
     1 2 4 2
     3 1 2 3

     invalid because the first column has element 1 appears three times and all 1s are connected to each other :

     1 2 1 3
     1 3 4 2
     1 2 4 4
     2 3 2 2
 */
import java.util.Random;

public class GenerateNxNMAtrix {
    public static void main(String[] args) {
        int[][] result = generateRandom(4);
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result[0].length;j++){
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] generateRandom(int size){
        Random r = new Random();
        int[][] dp = new int[size][size];

        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                int rand = r.nextInt(4) + 1;
                if(i > 1 && j > 1){
                    int a = dp[i-1][j];
                    int b = dp[i][j-1];
                    int c = dp[i-2][j];
                    int d = dp[i][j-2];
                    int newRand = rand;

                    if(rand == a && rand == c && b != d){
                        newRand = a;
                        while(newRand == a){
                            newRand = r.nextInt(4) + 1;
                        }
                    }else if(rand == b && rand == d && a != c){
                        newRand = b;
                        while (newRand == b){
                            newRand = r.nextInt(4) + 1;
                        }

                    }else if(a == c && b == d){
                        while(newRand == a  || newRand == b){
                            newRand = r.nextInt(4) + 1;
                        }
                    }
                    dp[i][j] = newRand;
                }
                else if(i > 1 && j <= 1){
                    int a = dp[i-1][j];
                    int b = dp[i-2][j];
                    int newRand = rand;
                    if(rand == a && rand == b){
                        newRand = a;
                        while(newRand == a){
                            newRand = r.nextInt(4) + 1;
                        }
                    }
                    dp[i][j] = newRand;
                }
                else{
                    dp[i][j] = rand;
                }
            }
        }
    return  dp;
    }
}


