package main.java.geeks;

import java.util.Arrays;

public class SortaString {
    public static void main(String[] args) {
        System.out.println(sort("edcab"));
    }
    static String sort(String s)
    {
        int count[] = new int[26];
        char sChar[] = s.toCharArray();
        Arrays.fill(count,0);
        for(int i=0; i<s.length(); i++){
            count[sChar[i] - 'a']++;
        }
        int index = 0;
        int ith_pos = 0;
        while(index <= sChar.length && ith_pos < 26){
            if(count[ith_pos] != 0){
                while(count[ith_pos] != 0){
                    char ch = (char) (ith_pos + 97);
                    sChar[index++] = ch;
                    count[ith_pos]--;
                }
            }
            ith_pos++;
        }
        return new String(sChar);
    }
}
