class Easy_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int d,rev=0;
        int n=x;
        if(x<0){
            return false;
        }
        else{
            while(x>0){
                d=x%10;
                rev=rev*10+d;
                x=x/10;
            }
            if(rev==n){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}