package main.java.geeks;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> kLargest(int arr[], int n, int k){
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        while(pq.size()<k){
            result.add(pq.remove());
        }
        return result;
    }

    public static int kthSmallest(int[] arr, int l, int r, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(r>=l) {
            pq.add(arr[l]);
            l++;
        }
        for(int j=0;j<k-1;j++) pq.remove();
        return pq.remove();
    }
}
