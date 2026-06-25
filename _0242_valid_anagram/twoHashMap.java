package _0242_valid_anagram;

import java.util.HashMap;

class twoHashMap {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> s_hm = new HashMap<>();
        HashMap<Character, Integer> t_hm = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            s_hm.put(ch, s_hm.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            t_hm.put(ch, t_hm.getOrDefault(ch, 0)+1);
        }

        if(s_hm.equals(t_hm)) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        twoHashMap obj = new twoHashMap();

        System.out.println(obj.isAnagram(s, t));
    }
}
