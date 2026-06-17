// LeetCode 78 - Subsets
// Approach: Recursion
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void allSubsets(int nums[],int idx,List<Integer> subset){
        if(idx==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        int ele=nums[idx];
        //include
        subset.add(ele);
        allSubsets(nums,idx+1,subset);
        //exclude
        subset.remove(subset.size()-1);
        allSubsets(nums,idx+1,subset);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        allSubsets(nums,0,subset);
        return ans;
        
    }
}
