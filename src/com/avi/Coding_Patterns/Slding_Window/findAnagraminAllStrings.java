package Slding_Window;

import java.util.*;

public class findAnagraminAllStrings {
    public static List<Integer> findAnagramsSumit(String s, String p) {
        List<Integer> result = new ArrayList<>();

        //Length of string p and s
        int pLen = p.length();
        int sLen = s.length();

        // Return empty result if any of the condition is true.
        if (s == null || s.length() == 0 || sLen < pLen) {
            return result;
        }

        //Declare an array of fixed sized.
        int[] pArr = new int[26];
        int[] sArr = new int[26];

        /* Put character count of array p in pArr.
         * Also, Create first window of size pLen.
         */
        for (int i = 0; i < p.length(); i++) {
            pArr[p.charAt(i) - 'a']++;
            sArr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sLen-pLen; i++) {
            if (isAnagram(pArr, sArr)) {
                result.add(i);
            }

            sArr[s.charAt(i) - 'a']--;
            sArr[s.charAt(i+pLen) - 'a']++;
        }

        if (isAnagram(pArr, sArr)) {
            result.add(sLen - pLen);
        }

        return result;

    }

    public static boolean isAnagram(int[] pArr, int[] sArr) {
        for (int i = 0; i < pArr.length; i++) {
            if (pArr[i] != sArr[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
   String s=new String("cbaebabacd");
        String p=new String("abc");
        List<Integer> result=findAnagramsSumit(s,p);
        System.out.println(result);


    }
}
