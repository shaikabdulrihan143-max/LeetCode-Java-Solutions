//Time Complexity:O(2n)
class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        long xor=0;
        for(int num:nums){
            xor=xor^num;
        }
        long rightmostbit=(xor & xor-1)^xor;
        int b1=0,b2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & (int)rightmostbit)!=0){
                b1=b1^nums[i];
            }
            else{
                b2=b2^nums[i];
            }
        }
        ans[0]=b1;
        ans[1]=b2;
        return ans;
    }
}
