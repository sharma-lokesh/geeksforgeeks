package main.java.geeks;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(45,3));
    }
    static int gcd(int a,int b){
        // code here
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
