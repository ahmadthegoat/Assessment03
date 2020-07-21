package com.stayready.as03.problem03;

import java.util.HashMap;

public class Problem03 {
    public String isPalindrome(String input){
        HashMap<Character, Integer> h = new HashMap<>();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            h.put(input.charAt(i), h.getOrDefault(input.charAt(i), 0) + 1);
        }

        for (int i = 0; i < input.length(); i++) {
            if (h.containsKey(input.charAt(i)) && h.get(input.charAt(i)) % 2 == 1) {
                count++;
                h.remove(input.charAt(i));
            }
        }
        if (count == 1)
            return "YES";

        return "NO";    }
    }

