package com.practice.strings;

/**
 * @author mbano
 *
 * Find the Index of the First Occurrence in a String
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * CONSTRAINTS:
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class IndexOfFirstOccurance {
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            int ret = 0;
            int j=0;
            for(int i = 0; i < haystack.length() && j<=i; i++)   {
                if(haystack.charAt(i) == needle.charAt(j)) {

                    if(j==0) {
                        ret = i;
                    }
                    j++;
                    if(j==needle.length()){
                        break;
                    }

                } else {
                    if(j>0)
                        i=i-j;
                    j=0;
                }

            }
            return ret;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle ="sad";
        System.out.println(strStr(haystack, needle));

        haystack = "leetcode";
        needle ="leeto";
        System.out.println(strStr(haystack, needle));

        haystack = "mississippi";
        needle ="issip";
        System.out.println(strStr(haystack, needle));
    }
}
