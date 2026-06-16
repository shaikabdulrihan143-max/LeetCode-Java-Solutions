class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int bitflips=0;
        while(ans!=0){
            bitflips++;
            ans=ans&(ans-1);
        }
        return bitflips;
    }
}
