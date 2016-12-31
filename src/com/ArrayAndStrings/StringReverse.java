package com.ArrayAndStrings;

import java.util.Scanner;

/**
 * Created by blossommendes on 31/12/16.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        // Solution 1
        int l = str.length();
        String reverse = "";
        for(int i = l - 1;i >= 0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

        // Solution 2

        StringBuilder sb = new StringBuilder(str);
        reverse = sb.reverse().toString();
        System.out.println(reverse);
    }
}
