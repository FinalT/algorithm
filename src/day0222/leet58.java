package day0222;

public class leet58 {
    public int lengthOfLastWord(String s) {
        int res = 0;
        char[] array = s.toCharArray();
        for (int i = array.length-1; i >=0 ; i--) {
            if (array[i] == ' '){
                if (res!=0){
                    return res;
                }
            }else {
                res++;
            }
        }
        return res;
    }
}
