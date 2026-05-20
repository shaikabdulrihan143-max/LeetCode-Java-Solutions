class Medium_ReverseInteger {
    public int reverse(int x) {
        int temp,n,d,rev=0;
        if(!((x<=Integer.MAX_VALUE)&& (x>=Integer.MIN_VALUE))){
            return 0;
        }
        else{
            if(x<0){
                temp=~x+1;
                n=temp;
                while(temp>0){
                    d=temp%10;
                    if(rev>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    rev=rev*10+d;
                    temp=temp/10;
                }
            }
            else{
                temp=x;
                n=temp;
                while(temp>0){
                    d=temp%10;
                    if(rev>Integer.MAX_VALUE/10){
                        return 0;
                    }
                    rev=rev*10+d;
                    temp=temp/10;
                }
            }
            if(x<0){
                return -rev;
            }
            else{
                return rev;
            }
            
        }
    }
}