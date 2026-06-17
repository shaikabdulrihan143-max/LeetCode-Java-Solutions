// LeetCode 78 - Subsets
// Approach: Bit Manipulation
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int tsubsets=1<<nums.length;//2^n
        for(int num=0;num<tsubsets;num++){
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if((num & (1<<i))!=0){
                    sub.add(nums[i]);
                }
            }
            ans.add(sub);
        }
        return ans;
    }
}
