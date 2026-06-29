package _0049_group_anagram;

import java.util.*;

public class sorting {
    public List<List<String>> groupAnagram(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] ch = word.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if(!map.containsKey(key))
                    map.put(key, new ArrayList<>());
            
            map.get(key).add(word);
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        frequency obj = new frequency();

        System.out.println(obj.groupAnagram(strs));
    }
}
