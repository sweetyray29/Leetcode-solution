class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String n = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if((ch >= '0' && ch <= '9') ||
               (ch >= 'a' && ch <= 'z')) {
                n = n + ch;
            }
        }

        String rev = "";

        for(int i = n.length() - 1; i >= 0; i--) {
            rev = rev + n.charAt(i);
        }

        return n.equals(rev);
    }
}