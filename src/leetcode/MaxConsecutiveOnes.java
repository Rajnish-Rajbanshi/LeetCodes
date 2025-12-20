class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int index=0;
        int comp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ++index;
            } else
                index=0;
    
            if(comp<index){
            comp=index;
            }
        }
        return comp;
    }
}
public class MaxConsecutiveOnes {
     public static void main(String[] args){
        Solution sol=new Solution();

        int[] nums={1,0,1,1};
    
        int ans=sol.findMaxConsecutiveOnes(nums);
        System.out.print(ans);
    }
}
