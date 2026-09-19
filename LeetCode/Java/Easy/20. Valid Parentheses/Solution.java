class Solution {
    public boolean isValid(String s) {

        while (true) {

            String old = s;

            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");

            if (s.equals(old)) {
                break;
            }
        }

        return s.length() == 0;
    }
}