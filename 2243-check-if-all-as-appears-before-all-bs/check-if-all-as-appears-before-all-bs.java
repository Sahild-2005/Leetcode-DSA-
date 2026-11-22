class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int a = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a') a++;
        }
        if (a == 0) return true;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (st.isEmpty()) {
                st.push(ch);
            } else if (st.peek() == 'a' && ch == 'a') {
                continue;
            } else if (st.peek() == 'a' && ch == 'b') {
                st.pop();
                st.push(ch);
            } else if (st.peek() == 'b' && ch == 'a') {
                return false;
            }
        }

        return true;
    }
}