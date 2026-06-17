// LeetCode 90 - Subsets-II
// Approach: Recursion&Backtracking+HashSet
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    HashSet<List<Integer>> set=new HashSet<>();
    public void uniqueSubsets(int nums[],int idx,List<Integer> subset){
        if(idx==nums.length){
            if(set.contains(subset)){
                return;
            }
            else{
                set.add(subset);
                ans.add(new ArrayList<>(subset));
                return;
            }
        }
        int ele=nums[idx];
        //include
        subset.add(ele);
        uniqueSubsets(nums,idx+1,subset);
        //exclude
        subset.remove(subset.size()-1);
        uniqueSubsets(nums,idx+1,subset);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> subset=new ArrayList<>();
        uniqueSubsets(nums,0,subset);
        return ans;
    }
}
