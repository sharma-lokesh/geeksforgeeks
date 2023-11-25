package main.java.geeks;


import java.util.*;
import java.util.stream.Collectors;

public class Check {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        map.put('a',3);
        map.put('c',13);
        map.put('b',4);
        map.put('t',7);
        map.put('e',1);
        map.put('z',133);
        map.put('d',0);


        //String res = map.keySet().stream().map(key -> key + (map.get(key)+"-")).collect(Collectors.joining());
        //System.out.println(res.substring(0,res.length()-1));
        String res = map.entrySet().stream().map(e ->e.getKey()+""+e.getValue()).collect(Collectors.joining("-"));
        System.out.println(res);

    }
}
