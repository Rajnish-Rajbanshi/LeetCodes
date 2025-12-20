import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int duplicate = -1, missing = -1;

        for (int num : nums) {
            freq[num]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) duplicate = i;
            else if (freq[i] == 0) missing = i;
        }
        return new int[]{duplicate, missing};
    }
}

public class SetMismatch {
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] nums={1,2,2,4};
        System.out.println(Arrays.toString(solution.findErrorNums(nums)));
    }
}
