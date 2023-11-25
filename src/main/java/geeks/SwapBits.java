package main.java.geeks;

public class SwapBits {
    public static void main(String[] args) {
        //System.out.println(swapBits(101));
        System.out.println(Integer.toBinaryString(154));
    }
    public static int swapBits(int n)
    {
        // Your code
        int result=0;
        int temp=n>>1;
        int var=(n&1);
        int counter=0;

        if(var==0){
            return temp;
        }else{
            while(n>0){
                if((n&1)==1){
                    counter++;
                }
                n = n>>1;
            }
            counter=(int)Math.pow(2,counter);
            result=(counter|temp);
        }
        return result;

    }
}
