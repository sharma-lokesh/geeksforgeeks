package main.java.geeks;

public class IsPallindrome {
    public static void main(String[] args) {
        System.out.println(is_palindrome(555));
    }
    public static String is_palindrome(int n)
    {
        // Code here
        int result = 0;
        int x= n;
        while(n<0){
            result=result*10 + n%10;
            n=n%10;
        }
        if(result == x){
            return "Yes";
        }else{
            return "No";
        }
    }
}
