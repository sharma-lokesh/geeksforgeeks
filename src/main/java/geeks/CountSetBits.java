package main.java.geeks;

import static java.lang.System.out;

public class CountSetBits {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        out.println(arr);
        //int arr1[][] = new int[][] {10,20,30,40,50,60};
        //out.println(countSetBits(4494644));
    }
    public static int countSetBits(int n){
        return BrianKernighanAlgorithm(n);
    }
    public static int  BrianKernighanAlgorithm(int n){
        int var=n;
        if(var == 1 || var  == 0) return var;
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count+BrianKernighanAlgorithm(var-1);
    }
}
