package main.java.geeks;

import java.io.IOException;

import java.util.HashSet;

public class LongestSubsequence {

    public static void main (String[] args) throws IOException {
        System.out.println(findLongestConseqSubseq(new int[2],3));
    }
    static int findLongestConseqSubseq(int arr[], int N)
    {
        HashSet S = new HashSet();
        int result = 0;
        //add elements in set, no duplicates
        for (int i = 0; i < N; ++i){
            S.add(arr[i]);
        }

        for (int i = 0; i < N; ++i)
        {
            if (!S.contains(arr[i] - 1))
            {
                int j = arr[i];
                while (S.contains(j)){
                    j++;
                }
                if (result < j - arr[i]){
                    result = j - arr[i];
                }
            }
        }
        return result;

    }
}
