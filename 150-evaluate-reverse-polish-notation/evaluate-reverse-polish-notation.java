class Solution {
    public int evalRPN(String[] s) {

        Stack<Integer> st = new Stack<>();

        int n = s.length;

        for (int i = 0; i < n; i++) {
            if (s[i].equals("+")) {
                int val2 = st.pop();
                int val1 = st.pop();
                int result = val1+val2;
                st.push(result);

            }
            else if(s[i].equals("-")){
                  int val2 = st.pop();
                int val1 = st.pop();
                int result = val1-val2;
                st.push(result);
            }
               else if(s[i].equals("/")){
                  int val2 = st.pop();
                int val1 = st.pop();
                int result = val1/val2;
                st.push(result);
            }
               else if(s[i].equals("*")){
                  int val2 = st.pop();
                int val1 = st.pop();
                int result = val1*val2;
                st.push(result);
            }
            else{
                int num = Integer.parseInt(s[i]);
                st.push(num);
            }

        }

     return st.peek();
    }
}