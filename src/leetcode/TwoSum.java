class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==(nums[i]+nums[j]))
                return new int[]{i,j};
                }
}
    return new int[0];
    }
}
public class TwoSum{
    public static void main(String[] Args){
        Solution sol=new Solution();
        int[] nums={1,2,3,4,5};
        int target=5;
        int[] targetIndex=sol.twoSum(nums,target);
        System.out.print(targetIndex);
    }
}