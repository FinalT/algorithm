package day0226;

import java.util.ArrayList;
import java.util.List;

public class leet6 {


    public String convert(String s, int numRows) {
        if (numRows<2){
            return s;
        }
        List<StringBuffer> rows = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuffer());
        }
        int i = 0;
        int flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i==0||i==numRows-1)flag = -flag;
            i+=flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuffer row : rows) {
            res.append(row);
        }
        return res.toString();

    }
}
