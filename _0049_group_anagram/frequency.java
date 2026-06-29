package _0049_group_anagram;

import java.util.*;

public class frequency {
    public List<List<String>> groupAnagram(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            int[] freq = new int[26];

            for(char ch : word.toCharArray())
                    freq[ch - 'a']++;

            StringBuilder key = new StringBuilder();

            for(int count : freq)
                key.append(count).append("#");

            if(!map.containsKey(key.toString()))
                map.put(key.toString(), new ArrayList<>());

            map.get(key.toString()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        frequency obj = new frequency();

        System.out.println(obj.groupAnagram(strs));
    }
}
