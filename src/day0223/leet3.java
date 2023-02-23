package day0223;

import java.util.HashMap;
import java.util.Map;

public class leet3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();
        if (s.length()==0){
            return 0;
        }
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);

        }
        return max;
    }
}
