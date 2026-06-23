//Time Complexity:O(nlogn+n/3)
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int bitindex=0;bitindex<32;bitindex++){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if((nums[i] & (1<<bitindex))!=0){
                    count++;
                }
            }
            if(count%3==1){
                ans=ans | (1<<bitindex);
            }
        }
        return ans;
    }
}
