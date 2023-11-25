package main.java.geeks;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main (String[] args) throws IOException {
        System.out.println(majorityElement(new int[2],3));
    }
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < size; i++) {
            if (map.containsKey(a[i])) {
                result = map.get(a[i]) +1;
                map.put(a[i], result);
            }
            else{
                map.put(a[i],1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                result = entry.getKey();
            }
        }
        if(max > size/2){
            return result;
        }else{
            return -1;
        }
    }
}
