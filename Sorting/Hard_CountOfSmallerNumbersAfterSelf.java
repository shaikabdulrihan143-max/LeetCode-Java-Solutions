class Solution {
    int count[];
    int index[];
    public void merge(int nums[],int si,int mid,int ei){
        int newArray[]=new int[ei+1-si];
        int idx=0;
        int idx1=si;
        int idx2=mid+1;
        while(idx1<=mid && idx2<=ei){
            if(nums[index[idx1]]<=nums[index[idx2]]){
                count[index[idx1]]+=(idx2-(mid+1));
                newArray[idx++]=index[idx1++];
            }
            else{
                newArray[idx++]=index[idx2++];
            }
        }
        while(idx1<=mid){
            count[index[idx1]]+=(idx2-(mid+1));
            newArray[idx++]=index[idx1++];
        }
        while(idx2<=ei){
            newArray[idx++]=index[idx2++];
        }
        for(int i=si,j=0;i<=ei;i++,j++){
            index[i]=newArray[j];
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
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        count=new int[n];
        index=new int[n];
        for(int i=0;i<n;i++){
            index[i]=i;
        }
        divide(nums,0,nums.length-1);
        List<Integer> ans=new ArrayList<>();
        for(int c:count){
            ans.add(c);
        }
        return ans;
    }
}
