class Hard_Medianof2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int size=m+n;
        int result[]=new int[size];
        int idx=0;
        int idx1=0;
        int idx2=0;
        while(idx1<m && idx2<n){
            if(nums1[idx1]<=nums2[idx2]){
                result[idx++]=nums1[idx1++];
            }
            else{
                result[idx++]=nums2[idx2++];
            }
        }
        while(idx1<m){
            result[idx++]=nums1[idx1++];
        }
        while(idx2<n){
            result[idx++]=nums2[idx2++];
        }
        int mid=size/2;        
        if(size%2==1){
            return (double)result[mid];
        }
        else{
            return (result[mid]+result[mid-1])/2.0;
        }
    }
}
