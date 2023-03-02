package day0302;

public class leet136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^=num;
        }
        return single;
    }
}
