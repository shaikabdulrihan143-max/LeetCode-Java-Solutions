class Easy_ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newString=s.toLowerCase().replaceAll("[^a-z0-9]","").replace("\\s+","");
        String reverseString="";
        for(int i=newString.length()-1;i>=0;i--){
            reverseString+=newString.charAt(i);
        }
        if(newString.compareTo(reverseString)==0){
            return true;
        }
        else{
            return false;
        }
    }
}