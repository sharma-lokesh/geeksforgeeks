package main.java.geeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GetTheShadow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                }
            }
            Arrays.sort(arr);
            for(int i=0; i<n;i++){
                if(arr[i]!=i+1){
                    System.out.println(arr[i]+" "+(i+1)+" ");
                }
            }
            HashMap<Integer, Integer> intCount = new HashMap<>();
            for(int i : arr){
                if(intCount.containsKey(i)){
                    intCount.put(i,intCount.get(i)+1);
                }else{
                    intCount.put(i,1);
                }
            }
        }
    }
}
