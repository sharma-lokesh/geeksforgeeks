package main.java.geeks;

public class StableSort {
    public static void main(String[] args) {
        long arr[] = new long[]{3, 4, 3, 5, 2, 3, 4, 3, 1, 5};
        int index = 5;
        System.out.println(getIndexofSortedArray(arr, arr.length, index));
    }
    static long getIndexofSortedArray(long arr[], int n, int index){
        int result = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<arr[index]){
                result++;
            }
            if(arr[i]==index && i<index){
                result++;
            }
        }
        return result;
    }
}

