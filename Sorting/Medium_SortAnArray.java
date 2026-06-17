class Solution {
    public void merge(int nums[],int si,int mid,int ei){
        int newArray[]=new int[ei+1-si];
        int idx=0;
        int idx1=si;
        int idx2=mid+1;
        while(idx1<=mid && idx2<=ei){
            if(nums[idx1]<=nums[idx2]){
                newArray[idx++]=nums[idx1++];
            }
            else{
                newArray[idx++]=nums[idx2++];
            }
        }
        while(idx1<=mid){
            newArray[idx++]=nums[idx1++];
        }
        while(idx2<=ei){
            newArray[idx++]=nums[idx2++];
        }
        for(int i=si,j=0;i<=ei;i++,j++){
            nums[i]=newArray[j];
        }
    }
    public void divide(int nums[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(nums,si,mid);
        divide(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        divide(nums,0,n-1);
        return nums;
    }
}
