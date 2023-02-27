package day0227;

public class leet7 {
    public int reverse(int x) {
        int res = 0;
        while (x!=0){
            //取末尾数字
            int temp = x % 10;
            if (res>214748364 || (res==214748364&&temp>7)){
                return 0;
            }

            if (res<-214748361 || (res==-214848364&&temp<-8)){
                return 0;
            }
            res = res*10 + temp;
            x/=10;
        }
        return res;
    }
}
