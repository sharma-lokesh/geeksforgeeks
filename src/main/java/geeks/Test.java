package main.java.geeks;

import java.util.HashSet;
import java.util.Iterator;

import static java.lang.Math.abs;

public class Test {
    static int result=0;
    public static void main(String[] args) {
        System.out.println(5^3);

        //get(6);
        // System.out.print(" "+result);

        //count(3);

        //System.out.print(foo(513, 2));

        //int a[] = {12, 7, 13, 4, 11, 6};
        //System.out.print(f(a,0,6));

        //System.out.print(f(2));
        //f(173);
        //int arr[] = new int[]{9,12,2,11,2,2,10,9,12,10,9,11,2};
        //System.out.println(fun(arr, arr.length));
        System.out.println(isPowerOfTwo(11));

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(5);
        set.add(15);
        set.add(20);
        for(int s : set){
            System.out.println(s+" ");
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.print(set.size());
        if(set.contains(15)){
            System.out.println("found 15");
        }
    }

    public static boolean isPowerOfTwo(int x){
        if(((x&(x-1)))==0){
            return true;
        }else{
            return false;
        }

    }
    public static int fun(int arr[], int n){
        int x = arr[0];
        for(int i=1; i<n; i++){
            x=x^arr[i];
        }
        return x;
    }
    static void get (int n){
        result++;
        if (n < 1)
            return;
        get(n - 1);
        get(n - 3);
        System.out.print(n);
    }
    static int d=1;
    static void count(int n)
    {
        System.out.print(n+" ");
        System.out.print(d+" ");
        d++;
        if(n > 1) count(n-1);
        System.out.print(d+" ");
    }

    static int foo( int n,  int r) {
        if (n  > 0) return (n%r +  foo (n/r, r ));
        else return 0;
    }

    static int f(int a[],int i, int n)
    {
        if(n <= 0) return 0;
        else if(a[i] % 2 == 0) return a[i] + f(a, i+1, n-1);
        else return a[i] - f(a, i+1, n-1);
    }

    static double f(double x){
        if (abs(x*x - 3) < 0.01) return x;
        else return f(x/2 + 1.5/x);
    }
    static void f (int n)
    {
        if (n <=1)  {
            System.out.print(n);
        }
        else {
            f (n/2);
            System.out.print(n%2);
        }
    }
}
