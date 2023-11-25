package main.java.geeks;


class LongestConsicutiveOne{

    /*  Function to calculate the longest consecutive ones
     *   N: given input to calculate the longest consecutive ones
     */
    public static int maxConsecutiveOnes(int N) {

        // Your code here
        int result=0;
        int temp=0;
        while(N>0){
            if((N & 1)==1)
            {
                temp++;
                result = Math.max(temp,result);
            }else{
                temp=0;
            }
            N>>=1;
        }

        return result;


    }
}



//{ Driver Code Starts.

class Main {

    public static void main (String[] args) {
        LongestConsicutiveOne obj = new LongestConsicutiveOne();
            System.out.println(obj.maxConsecutiveOnes(14));
    }
}

