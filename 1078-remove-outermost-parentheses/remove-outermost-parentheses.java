class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;

        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (count != 0) {
                    ans = ans + ch;
                    count++;
                } else
                    count++;
            } else {
                count--;
                if (count != 0) {
                    ans = ans + ch;
                }

            }
        }
        return ans;
    }
}