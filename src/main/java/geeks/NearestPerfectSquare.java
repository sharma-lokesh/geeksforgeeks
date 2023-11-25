package main.java.geeks;

import java.util.*;
import java.lang.*;
class NearestPerfectSquare
{
    public static void main (String[] args)
    {
        //code
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0){
            int input = sc.nextInt();

            int small = 0;
            int big = 0;

            if(isPerfectSq(input)){
                small = (int)Math.sqrt(input)-1;
                big = (int)Math.sqrt(input)+1;
            }else{
                small = (int)Math.floor(Math.sqrt(input));
                big = (int)Math.ceil(Math.sqrt(input));
            }

            if(Math.abs((big*big-input)) > Math.abs((small*small-input))){
                System.out.println(small*small);
            }else{
                System.out.println(big*big);
            }


        }
    }

    public static boolean isPerfectSq(int n){
        int number = (int)Math.sqrt(n);
        int square = number*number;
        if(number == square){
            return true;
        }else{
            return false;
        }
    }


}
