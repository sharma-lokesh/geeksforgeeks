package main.java.geeks;

import java.util.Scanner;

public class ConversionToOne {
    public static void main (String[] args)
    {
        //code
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0){
            int input = sc.nextInt();

            if(input==1){
                System.out.println(0);
            }else{
                if(input%2==0){
                    while(input>0){
                        result++;
                        input=input/2;
                    }
                }else{
                    input = input-1;
                    while(input>0){
                        result++;
                        input=input/2;
                    }
                }
            }
            System.out.println(result);
        }

    }
}
