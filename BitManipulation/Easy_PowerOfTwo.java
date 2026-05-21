class Easy_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        String Binary="";
        int b;
        while(n>0){
            b=n%2;
            Binary+=b;
            n/=2;
        }
        int count=0;
        for(int i=0;i<Binary.length();i++){
            if(Binary.charAt(i)=='1'){
                count++;
            }
        }
        return count==1;
    }
}