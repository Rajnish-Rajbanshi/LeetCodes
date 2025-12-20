public class CountSmallerNum {
   public static void main(String[] args){
        Solution sol=new Solution();

        int[] nums={1,2,1};
    
        int[] ans=sol.smallerNumbersThanCurrent(nums);
        for(int Ans:ans){
            System.out.print(Ans + " ");
        }
    } 
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(j != i){
                    if (nums[j] < nums[i]) {
                    count+=1;
                    } 
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}