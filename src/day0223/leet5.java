package day0223;

public class leet5 {
    public static String longestPalindrome(String s) {
        if (s==null||s.length()==0){
            return "";
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
        int left = 0;
        int right= 0;
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
            if (max <= pArr[i]){
                max = pArr[i];
                left = i-max;
                right = i+max;
            }
        }


        StringBuffer ans = new StringBuffer();

        for (int i = left+1; i <right; i++) {
            if (str.charAt(i)!='#')ans.append(str.charAt(i));
        }

//        String ans = str.substring(left+1,right).replace("#","");
        return ans.toString();
    }


    public static void main(String[] args) {
        String s1 = "abcbabcbaa";
        String s2 = "nabbb";
        String a1 = longestPalindrome(s1);
        String a2 = longestPalindrome(s2);
        System.out.println(a1);
        System.out.println(a2);
    }

}
