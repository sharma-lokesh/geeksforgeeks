package main.java.geeks;

import java.util.*;
import java.lang.*;
import java.io.*;

class CountReversePair {

        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int N = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }
                CountReversePair obj = new CountReversePair();
                int res = obj.countRevPairs(N, arr);
                System.out.println(res);
            }
        }

    public int merge(int []arr,int low,int mid,int high){
        //declare a two array and store the sorted array
        int []left = new int[mid-low+1];
        for(int i=0;i<left.length;i++)left[i]=arr[low+i];
        int []right = new int[high-mid];
        for(int i =0;i<right.length;i++)right[i]=arr[mid+i+1];
        //find the element in left array which fulfill the condition left[i]>2*right[j]
        int pairs = 0;
        int t =0;
        for(int i =0;i<left.length;i++){
            while(t<right.length && left[i]>(2*(long)right[t])){
                pairs+=(left.length-i);
                t++;
            }
        }
        int i =0,j=0,k=low;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return pairs;
    }
    public int mergeSort(int []arr,int low,int high){
        int pairs =0;
        if(low<high){
            int mid = (low+high)/2;
            pairs+=mergeSort(arr,low,mid);
            pairs+=mergeSort(arr,mid+1,high);
            pairs+=merge(arr,low,mid,high);
        }
        return pairs;
    }
    public int countRevPairs(int N, int arr[]) {
        // Code here
        int low = 0;
        int high = N-1;
        return mergeSort(arr,low,high);
    }
}
