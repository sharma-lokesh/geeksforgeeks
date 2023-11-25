package main.java.geeks;

//{ Driver Code Starts
//Initial Template for Java


import java.io.*;

class divide {


    public static void main (String[] args) throws IOException{

            Solution1 ob = new Solution1();

            System.out.println(ob.divide(3,1));

    }
}

// } Driver Code Ends


//User function Template for Java

class Solution1
{
    public static long divide(long a, long b)
    {
        //code here
        boolean isNegative = false;
        if(a < 0 || b < 0)isNegative=true;
        long A = 0L;
        long B = 0L;
        if(isNegative){
             A = Math.abs(a);
             B = Math.abs(b);
        }else {
            A = a;
            B = b;
        }


        long i = 0;
        while(B<=A){
            i++;
            B = B + Math.abs(b);
        }
        if(isNegative){
            return i*-1;
        }else {
            return i;
        }
    }
}
