package main.java.geeks;

class ProductExcept
{
    public static void main(String[] args) {
        int nums[] = new int[5];
        productExceptSelf(nums, 5);
    }
    public static long[] productExceptSelf(int nums[], int n)
    {
        long temp[] = new long[n];
        int multiplySum =1;
        int zeroAt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){

            }
        }

        if(multiplySum != 0){
            for(int j =0; j< n; j++){
                if(nums[j] !=0){
                    temp[j] = multiplySum / nums[j];
                }else{
                    temp[j] = 0;
                }

            }

            return temp;
        }else{
            for(int j =0; j< n; j++){
                if(j == zeroAt){
                    temp[j] = multiplySum;
                }else{
                    temp[j] = 0;
                }
            }
            return temp;

        }
    }
}
