package main.java.geeks;

import java.util.*;
import java.util.stream.Collectors;


public class StringCompressor {
    public static String compressString(String input) {
        Map<Character, Integer> count = new HashMap<>();
        int index = 0;

        while (index < input.length()) {
            char c = input.charAt(index);
            if (Character.isLetter(c)) {
                int temp = index + 1;
                String num = "";
                while (temp < input.length()) {
                    char at = input.charAt(temp);
                    if (Character.isLetter(at)) {
                        index = temp - 1;
                        break;
                    }
                    num += String.valueOf(at);
                    temp++;
                }
                count.put(c, count.getOrDefault(c, 0) + Integer.parseInt(num));
            }
            index++;
        }
        return count.keySet().stream().map(key -> key + String.valueOf(count.get(key))).collect(Collectors.joining());
    }

    public static String usingSlidingWindow(String input) {
        Map<Character, Integer> count = new HashMap<>();
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < input.length(); windowEnd++) {
            char atWindowEnd = input.charAt(windowEnd);
            if (Character.isLetter(atWindowEnd)) continue;
            String res = "";
            while (windowEnd < input.length() && !Character.isLetter(input.charAt(windowEnd))) {
                res += String.valueOf(input.charAt(windowEnd++));
            }
            char atStart = input.charAt(windowStart);
            count.put(atStart, count.getOrDefault(atStart, 0) + Integer.parseInt(res));
            windowStart = windowEnd;
        }
        return count.keySet().stream().map(key -> key + String.valueOf(count.get(key))).collect(Collectors.joining());
    }

    public static String usingStack(String input) {
        Map<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        stack.push(input.charAt(0));

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < input.length(); i++) {
            if(Character.isLetter(input.charAt(i))) {
                Character topChar = stack.peek();
                map.put(topChar, map.getOrDefault(topChar, 0) + Integer.parseInt(sb.toString()));
                stack.push(input.charAt(i));
                sb = new StringBuilder();
            } else {
                sb.append(input.charAt(i));
            }
        }
        if(!sb.toString().equals("")) {
            Character topChar = stack.peek();
            map.put(topChar, map.getOrDefault(topChar, 0) + Integer.parseInt(sb.toString()));
        }
        return map.keySet().stream().map(key -> key + String.valueOf(map.get(key))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "a2b4c2d4b3c5b4e3";

        //String compressed = compressString(input);
        //String compressed = usingSlidingWindow(input);
        String compressed = usingStack(input);
        System.out.println(compressed); // Output: "a2b4c4d4"
    }
}
