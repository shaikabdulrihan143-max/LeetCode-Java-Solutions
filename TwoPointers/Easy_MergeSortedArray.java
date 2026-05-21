import java.util.*;
class Easy_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=0;
        int count=0;
        for(int i=0;i<m;i++){
            nums1[idx++]=nums1[i];
        }
        count=0;
        for(int i=0;i<n;i++){
            nums1[idx++]=nums2[i];
        } 
        Arrays.sort(nums1);
    }
}