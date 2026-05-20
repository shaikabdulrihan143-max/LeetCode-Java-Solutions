import java.util.*;
class Easy_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                flag=true;
                break;
            }
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
}