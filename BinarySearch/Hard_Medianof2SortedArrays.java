class Hard_Medianof2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length+nums2.length];
        int idx=0,temp;
        for(int i=0;i<nums1.length;i++){
            result[idx++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            result[idx++]=nums2[i];
        }
        for(int i=0;i<result.length;i++){
            for(int j=i+1;j<result.length;j++){
                if(result[i]>result[j]){
                    temp=result[i];
                    result[i]=result[j];
                    result[j]=temp;
                }
            }
        }
        int low=0,high=result.length-1;
        int mid=(low+high)/2;
        if(result.length%2==1){
            return result[mid];
        }
        else{
            return (double)(result[mid]+result[mid+1])/2;
        }
    }
}