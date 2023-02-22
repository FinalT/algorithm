package day0222;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leet20 {

    public static boolean isValid(String s) {
        if (s.isEmpty() && s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();

        for (char c : array) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c=='}'){
                    if (stack.pop()!='{'){
                        return false;
                    }
                }else if (c==']'){
                    if (stack.pop()!='['){
                        return false;
                    }
                }else if (c==')'){
                    if (stack.pop()!='('){
                        return false;
                    }
                }
            }else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    static class TestCases{
        String testname;
        String input;
        boolean wantVal;


        public TestCases(String testname, String input, boolean wantVal) {
            this.testname = testname;
            this.input = input;
            this.wantVal = wantVal;
        }
    }



    public static void main(String[] args) {
        List<TestCases> testCases = new ArrayList<>();
        testCases.add(new TestCases("test1","()",true));
        testCases.add(new TestCases("test2","[]{}()",true));
        testCases.add(new TestCases("test3","(]",false));

        for (TestCases testCase : testCases) {
            System.out.println(testCase.testname);
            boolean val = isValid(testCase.input);
            if (testCase.wantVal==val){
                System.out.println("PASS");
            }else {
                System.out.println("ERR");
                System.out.println("VAL:  " + val);
                System.out.println("WANTVAL:    " + testCase.wantVal);
            }
            System.out.println("------------------------");
        }
    }
}




