import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisapperedNumInArray {
    public static void main(String[] args){
        Solution sol=new Solution();

        int[] nums={1,2,1};
    
        List<Integer> ans=sol.findDisappearedNumbers(nums);
        for(int Ans:ans){
            System.out.print(Ans + " ");
        }
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> list = new HashSet<>();
       List <Integer> arr = new ArrayList<>();

       for(int i:nums)
       {
            list.add(i);
       }
        for(int i=1;i<=nums.length;i++)
        {
            if(!list.contains(i))
            {
                arr.add(i);
            }
        }
        return arr;
    }
}
