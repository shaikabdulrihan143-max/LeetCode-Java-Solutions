// LeetCode 90 - Subsets-II
// Approach: Bit Manipulation+HashSet
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int tsubsets=1<<n;
        for(int num=0;num<tsubsets;num++){
            List<Integer> sub=new ArrayList<>();
            for(int pos=0;pos<n;pos++){
                if((num & (1<<pos))!=0){
                    sub.add(nums[pos]);
                }
            }
            if(!set.contains(sub)){
                ans.add(sub);
                set.add(sub);
            }
        }
        return ans;
    }
}
