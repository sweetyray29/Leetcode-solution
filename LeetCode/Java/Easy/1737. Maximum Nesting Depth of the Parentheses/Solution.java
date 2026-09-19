class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c++;
                if (c > max) {
                    max = c;
                }
            }
            else if (s.charAt(i) == ')') {
                c--;
            }
        }
        return max;
    }
}
