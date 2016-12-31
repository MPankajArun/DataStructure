package com.ArrayAndStrings;


import java.util.Arrays;

/**
 * Created by Pankaj Arun Meshram on 27/12/16.
 */
public class IsAnagrams {

    public static boolean isAnagarams(String s1, String s2){

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(a.length != b.length) return false;

        for(int i = 0;i < a.length;i++){
            if(a[i] != b[i]) return false;
        }
        return true;

    }


public static void main(String[] args) {
    System.out.println(isAnagarams("absd","bsac"));
    System.out.println(isAnagarams("aaaa","aaaa"));
    System.out.println(isAnagarams("abababa","abababa"));
}

}
