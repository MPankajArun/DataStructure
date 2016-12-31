package com.ArrayAndStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pankaj Arun Meshram on 27/12/16.
 */
public class IsUniqueString {

    public static void main(String[] args) {
        // write your code here
        String str = "abcdefgh";
        String str1 = "aaabaa";
        String str2 = "";
        IsUnique obj = new IsUnique();
        System.out.println(obj.isUnique(str));
        System.out.println(obj.isUniqueUsingHashSet(str1));
        System.out.println(obj.isUniqueUsingHashSet(str2));

    }
}

class IsUnique{

    public boolean isUnique(String str){
        for(int i = 0;i != str.length()-1;i++){
            for(int j = i+1;j != str.length();j++){
                if(str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public boolean isUniqueUsingHashSet(String str){
        char[] s = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for(Character ss : s)
            set.add(ss);
        if(str.length() == set.size())
            return true;
        else
            return false;
    }


}