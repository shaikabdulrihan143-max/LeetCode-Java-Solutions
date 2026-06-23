//Time Complexity:O(n)
//Concept oF Bucket(Best Optimal Solution)
class Solution {
    public int singleNumber(int[] nums) {
        int ones=0;
        int twos=0;
        int threes=0;
        for(int i=0;i<nums.length;i++){
            ones=(ones^nums[i])&~twos;
            twos=(twos^nums[i])&~ones;
        }
        return ones;
    }
}
