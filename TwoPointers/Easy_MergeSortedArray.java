class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newArray[]=new int[m+n];
        int idx=0;
        int idx1=0;
        int idx2=0;
        while(idx1<=m-1 && idx2<=n-1){
            if(nums1[idx1]<=nums2[idx2]){
                newArray[idx++]=nums1[idx1++];
            }
            else{
                newArray[idx++]=nums2[idx2++];
            }
        }
        while(idx1<=m-1){
            newArray[idx++]=nums1[idx1++];
        }
        while(idx2<=n-1){
            newArray[idx++]=nums2[idx2++];
        }
        for(int i=0;i<newArray.length;i++){
            nums1[i]=newArray[i];
        }
    }
}
