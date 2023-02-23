package day0223;

public class leet5 {
    public static int longestPalindrome(String s) {
        if (s==null||s.length()==0){
            return 0;
        }
        StringBuffer str = new StringBuffer("#");
        for (int i = 0; i < s.length(); i++) {
            str.append(s.charAt(i));
            str.append("#");
        }
         
        int[] pArr = new int[str.length()];
        int C = -1; //中心
        int R = -1; //回文右边界再往右的一个位置
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {

            pArr[i] = R>i? Math.min(pArr[2*C-i],R-i):1;


            while (i+pArr[i] < str.length() && i-pArr[i] >- 1 ){
                if (str.charAt(i+pArr[i])==str.charAt(i-pArr[i])){
                    pArr[i]++;
                }else {
                    break;
                }
            }

            if (i+pArr[i]>R){
                R=i+pArr[i];
                C=i;
            }
            max = Math.max(max,pArr[i]);
        }
        return max-1;
    }


    public static void main(String[] args) {
        String s = "abcbabcbaa";
        int i = longestPalindrome(s);
        System.out.println(i);
    }

}
