package day0224;

public class leet70 {
    public int climbStairs(int n) {

        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i <=n; ++i) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
