class Medium_Combinations {
    public void helper(List<Integer> values,int k,List<List<Integer>> ans,List<Integer> combination,int idx){
        if(combination.size()==k){
            ans.add(new ArrayList<>(combination));
            return;
        }
        for(int i=idx;i<values.size();i++){
            combination.add(values.get(i));
            helper(values,k,ans,combination,i+1);
            combination.remove(combination.size()-1);

        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> values=new ArrayList<>();
        List<Integer> combination=new ArrayList<>();
        for(int i=1;i<=n;i++){
            values.add(i);
        }
        helper(values,k,ans,combination,0);
        return ans;

    }
}