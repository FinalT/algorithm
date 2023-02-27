package day0227;

public class leet12 {

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public String intToRoman(int num) {
        StringBuffer res =new StringBuffer();
        for (int i = 0; i <values.length ; i++) {
            int v = values[i];
            while (num>v){
                num-=v;
                res.append(symbols[i]);
            }
        }
        return res.toString();
    }
}
