class Easy_CountingBits {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int temp=i;
            int count=0;
            while(temp>0){
                count++;
                temp=temp&(temp-1);
            }
            ans[i]=count;
        }
        return ans;
    }
}