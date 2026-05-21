class Easy_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String arr[]=s.split("\\s+");
        return arr[arr.length-1].length();
    }
}