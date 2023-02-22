package day0222;

public class leet67 {

    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();

        int n = Math.max(a.length(),b.length());
        int car = 0;

        for (int i = 0; i < n; ++i) {
            car += i<a.length()?(a.charAt(a.length()-1-i) - '0') : 0;
            car += i<b.length()?(b.charAt(b.length()-1-i)- '0') : 0;
            ans.append((char)(car%2 + '0'));
            car/=2;
        }
        if (car>0){
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();

    }
}
