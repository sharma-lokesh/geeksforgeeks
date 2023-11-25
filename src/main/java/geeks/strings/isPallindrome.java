package main.java.geeks.strings;

public class isPallindrome {
    public static void main(String[] args) {
        String s = "ABCCABA";
        /*StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/
        int begin = 0;
        int end=s.length()-1;
        boolean isPall = true;
        while(end>begin){
            if(s.charAt(begin)!=s.charAt(end)){
                isPall = false;
                break;
            }else{
                end--;
                begin++;
            }
        }
        System.out.println(isPall);
    }
}
