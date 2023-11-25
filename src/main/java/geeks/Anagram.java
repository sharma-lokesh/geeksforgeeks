package main.java.geeks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(remAnagrams("bcadeh","hea"));
    }
    public static int remAnagrams(String s,String s1){
        int freq[] = new int[26];
        int n = s.length();
        int m = s1.length();

        for(int i = 0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i = 0;i<m;i++){
            freq[s1.charAt(i)-'a']--;
        }

        int ans = 0;
        for(int i = 0;i<26;i++){
            ans += Math.abs(freq[i]);
        }
        return ans;
    }
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        while(i>n){
            if(a[i]+b[i]!=k){
                return false;
            }
            i++;
        }
        return true;
    }
}
