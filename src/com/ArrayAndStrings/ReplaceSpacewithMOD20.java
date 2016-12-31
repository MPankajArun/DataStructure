package com.ArrayAndStrings;

import java.io.*;

public class ReplaceSpacewithMOD20 {
    public static char[] ReplaceSpacewithMOD20(char[] chars, int len) {
        int spaces = countSpaces(chars, len);
        int end = len - 1 + spaces * 2;
        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[end - 2] = '%';
                chars[end - 1] = '2';
                chars[end]     = '0';
                end -= 3;
            } else {
                chars[end] = chars[i];
                end--;
            }
        }
        return chars;
    }

    static int countSpaces(char[] chars, int len) {
        int count = 0;
        for (int i = 0; i < len; i++)
            if (chars[i] == ' ')
                count++;
        return count;
    }

    public static void main(String[] args) throws IOException {
        char[] chars = "Pankaj Arun Meshram    ".toCharArray();
        char[] chars1 = "I Love PICT   ".toCharArray();
        System.out.println(ReplaceSpacewithMOD20(chars, 19));
        System.out.println(ReplaceSpacewithMOD20(chars1, 9));
    }
}
