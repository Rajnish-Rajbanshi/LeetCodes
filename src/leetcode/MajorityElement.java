
class Solution {
    public int majorityElement(int[] nums) {

        int maj_elem=0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){

                if(nums[i]==nums[j]){
                    count++;
                } 
                if(count > (nums.length/2))
                    maj_elem=nums[i];
                    break;
            }
        }     
     return maj_elem;
    }
}
public class MajorityElement{
    public static void main(String[] args){
        Solution sol=new Solution();
        int[] array={3};

        int maj_elem=sol.majorityElement(array);
        System.out.println(maj_elem);

    }
}