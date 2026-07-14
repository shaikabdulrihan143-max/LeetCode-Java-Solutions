class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor){
            return 1;
        }
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean sign=true;//+ve
        if(dividend>=0 && divisor<0){
            sign=false;
        }
        if(dividend<0 && divisor>0){
            sign=false;
        }
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long ans=0;
        while(n>=d){
            int pow=0;
            while(n>=(d<<(pow+1))){
                pow++;
            }
            ans+=(1<<pow);
            n=n-(d<<(pow));
        }
        if(ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(ans<=Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return sign?(int)ans:(int)(-1*ans);
    }
}
