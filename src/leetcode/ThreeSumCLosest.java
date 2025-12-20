import java.util.Arrays;

    class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2]; // initial sum

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    // exact match
                    return currentSum;
                }
            }
        }
     
        return closestSum;
    }
}
public class ThreeSumCLosest {
    public static void main(String[] args) {
         Solution sol=new Solution();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(sol.threeSumClosest(nums, target)); // Output: 2
    }
}
