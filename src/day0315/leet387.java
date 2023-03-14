package day0315;

public class leet387 {
    public int firstUniqChar(String s) {
        char[] cr = s.toCharArray();
        char[] chars = new char[128];
        for (int i = 0; i <s.length() ; i++) {
            chars[cr[i]]++;
        }
        for (int i = 0; i <cr.length ; i++) {
            if (chars[cr[i]]==1){
                return i;
            }
        }
        return -1;
    }
}
