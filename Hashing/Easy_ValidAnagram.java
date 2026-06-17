class Solution {
    int freq1[]=new int[26];
    int freq2[]=new int[26];
    public void storeCharFreqFirst(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int mapping=ch-'a';
            freq1[mapping]++;
        }
    }
    public void storeCharFreqSecond(String t){
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int mapping=ch-'a';
            freq2[mapping]++;
        }
    }
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()){
            return false;
        }
        else{
            storeCharFreqFirst(s);
            storeCharFreqSecond(t);
            if(Arrays.compare(freq1,freq2)==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
