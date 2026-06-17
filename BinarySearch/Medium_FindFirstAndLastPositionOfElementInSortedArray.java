class Solution {
    int ans[]=new int[2];
    public int findFirstOccurence(int nums[],int target){
        int first=-1;
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid=low+(high-low)/2;
        }
        return first;
    }
    public int findLastOccurence(int nums[],int target){
        int last=-1;
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            mid=low+(high-low)/2;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int idx=0;
        ans[idx++]=findFirstOccurence(nums,target);
        ans[idx++]=findLastOccurence(nums,target);
        return ans;
    }
}
