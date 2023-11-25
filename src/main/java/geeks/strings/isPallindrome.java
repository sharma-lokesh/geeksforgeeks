package main.java.geeks.strings;

public class isPallindrome {
    public static void main(String[] args) {
        String s = "ABCBA";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
