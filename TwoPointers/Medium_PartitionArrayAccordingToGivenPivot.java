class Medium_PartitionArrayAccordingToGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {
        int idx=0;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                result[idx++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                result[idx++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                result[idx++]=nums[i];
            }
        }
        return result;
    }
}