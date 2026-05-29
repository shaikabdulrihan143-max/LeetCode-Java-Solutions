class Easy_SortColors {
    public void sort(int nums[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        int pivot=nums[mid];
        int left=si;
        int right=ei;
        while(left<=right){
            while(nums[left]<pivot){
                left++;
            }
            while(nums[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        sort(nums,si,right);
        sort(nums,left,ei);
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        sort(nums,0,n-1);
    }
}
