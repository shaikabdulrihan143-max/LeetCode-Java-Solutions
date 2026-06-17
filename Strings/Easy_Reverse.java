class Solution {
    public void reverseString(char[] s) {
        char[] result = new char[s.length];
        int idx = 0;

        for(int i = s.length - 1; i >= 0; i--) {
            result[idx++] = s[i];
        }

        for(int i = 0; i < s.length; i++) {
            s[i] = result[i];
        }
	System.out.println(Arrays.tostring(s));
    }
}
