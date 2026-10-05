class Solution {
    public int scoreOfParentheses(String s) {
       if (s.equals(""))
            return 0;
        int open = 1;
        int count = 0;
        int n = s.length();

        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (ch == '(')
                open++;
            // else close++;

            if (ch == ')') {
                if (prev == '(') {
                    count = count + (int)Math.pow(2,open - 1);
                }
                open = open - 1;
            }

        }
        return count;
    }
}