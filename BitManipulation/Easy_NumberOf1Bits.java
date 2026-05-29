class Easy_NumberOf1Bits {
    public int hammingWeight(int n) {
        String binary="";
        while(n>0){
            int d=n%2;
            binary=binary+d;
            n=n/2;
        }
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}