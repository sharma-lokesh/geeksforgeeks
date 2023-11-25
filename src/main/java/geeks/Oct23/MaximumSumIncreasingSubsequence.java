package geeks.Oct23;

public class MaximumSumIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = {1, 101, 2, 3, 100};
        System.out.println(maxSumIS(arr, arr.length));
    }

    public static int maxSumIS(int arr[], int n)
    {
        //code here.
        int[] dp = new int[n];
        int maxSum = 0;

        for(int i = 0; i < n; i++){
            dp[i] = arr[i];
        }

        for(int i = 0; i < n; i++){
            for( int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+arr[i]);
                }
            }
            maxSum = Math.max(dp[i],maxSum);
        }

        return maxSum;
    }
}
