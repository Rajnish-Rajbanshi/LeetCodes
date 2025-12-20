
    class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];      // x1, x2, ..., xn
            result[index++] = nums[i + n];  // y1, y2, ..., yn
        }

        return result;
    }
}
public class ShuffleTheArray {
    public static void main(String[] args){
        Solution sol=new Solution();

        int n=3;
        int[] nums={1,2,3,4,5,6};

        int[] ans=sol.shuffle(nums,n);
        for(int Ans:ans){
            System.out.print(Ans + " ");
        }
    }
}
