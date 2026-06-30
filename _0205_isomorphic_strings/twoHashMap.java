package _0205_isomorphic_strings;

import java.util.*;

public class twoHashMap {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> ST = new HashMap<>();
        HashMap<Character, Character> TS = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if(ST.containsKey(chS)) {
                if(ST.get(chS) != chT) return false;
            } else {
                ST.put(chS, chT);
            }


            if(TS.containsKey(chT)) {
                if(TS.get(chT) != chS) return false;
            } else {
                TS.put(chT, chS);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "egg";

        twoHashMap obj = new twoHashMap();

        System.out.println(obj.isIsomorphic(s, t));
    }
}
