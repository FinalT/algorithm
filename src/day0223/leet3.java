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
//优化，使用数组
    public int lengthOfLongestSubstringB(String s) {
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i]=-1;
        }
        int res =0;
        int start = 0;//窗口开始的地方
        for (int i = 0; i <s.length(); i++) {
            int index = last[s.charAt(i)];
            start  = Math.max(start,index+1);
            res = Math.max(res,index-start+1);
            last[s.charAt(i)]=i;
        }
        return res;

    }
}
