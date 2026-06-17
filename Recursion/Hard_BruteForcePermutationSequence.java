class Solution {
    //Time complexity O(n!)
    // just for basic understanding of recursion and backtracking
    // runs in leetcode successfully
    int count=0;
    String ans="";
    public String getPermutation(int n, int k) {
        String s="";
        for(int i=1;i<=n;i++){
            s+=i;
        }
        knowPermutations(s,"",k);
        return ans;
    }
    public void knowPermutations(String s,String permutation,int k){
        if(s.length()==0){
            count++;
            if(count==k){
                ans=permutation;
            }
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            knowPermutations(newString,permutation+ch,k);
            if(count==k) return;
        }
    }
}
