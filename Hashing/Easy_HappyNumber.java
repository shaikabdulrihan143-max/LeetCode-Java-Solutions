class Solution {
    public boolean helper(int n,HashSet<Integer> set){
        if(n==1){
            return true;
        }
        if(set.contains(n)){
            return false;
        }
        int happy=0;
        set.add(n);
        while(n>0){
            int d=n%10;
            happy=happy+(d*d);
            n=n/10;
        }
        return helper(happy,set);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        return helper(n,set);
    }
}
