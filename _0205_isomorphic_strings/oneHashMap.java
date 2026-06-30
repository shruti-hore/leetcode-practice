package _0205_isomorphic_strings;

import java.util.*;

public class oneHashMap {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char og = s.charAt(i);
            char replace = t.charAt(i);

            if(!map.containsKey(og)) {
                if(!map.containsValue(replace)) {
                    map.put(og, replace);
                } else return false;
            } else {
                char mapped = map.get(og);
                if(mapped != replace) return false;
            }
        }
        return true;
    }   
    
    public static void main(String[] args) {
        String s = "f11";
        String t = "b23";

        oneHashMap obj = new oneHashMap();

        System.out.println(obj.isIsomorphic(s, t));
    }
}