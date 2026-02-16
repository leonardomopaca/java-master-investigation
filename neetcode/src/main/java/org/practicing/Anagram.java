package org.practicing;

import java.util.*;

public class  Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                count[c - 'a']++;
            }

            // Convert the 26-length frequency array into a stable key
            // (acts like tuple(count) in Python)
            String key = Arrays.toString(count);

            res.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        String[] inputStrings = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            inputStrings[i] = sc.next();
        }

        Anagram solution = new Anagram();
        List<List<String>> result = solution.groupAnagrams(inputStrings);
        System.out.println("Grouped anagrams: " + result);

        sc.close();
    }
}