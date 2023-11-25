package main.java.geeks;
/**
 * Given a string, print all the char followed by their frequency
 * */
public class CharFreq {
    public static void main(String[] args) {
        countFreq("lokeshsharma");
    }
    public static void countFreq(String s){
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(count[i]>0) System.out.println((char)(i+'a') + " " + count[i]);
        }
    }
}
