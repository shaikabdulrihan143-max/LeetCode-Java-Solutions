class Solution {
    public String keypad[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void helper(String digits,List<String> ans,String combination,int idx){
        if(idx==digits.length()){
            ans.add(combination);
            return;
        }
        char ch=digits.charAt(idx);
        String mapping=keypad[ch-'2'];
        for(int i=0;i<mapping.length();i++){
            helper(digits,ans,combination+mapping.charAt(i),idx+1);

        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        helper(digits,ans,"",0);
        return ans;
    }
}
