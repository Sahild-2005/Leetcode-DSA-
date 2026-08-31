class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();

      int n = s.length();
      int max = Integer.MIN_VALUE;

      for(int i=0;i<n;i++){
        char ch = s.charAt(i);

        if(ch=='('){
            st.push(ch);
        }
        else if(ch==')'){
            max = Math.max(max,st.size());
            st.pop();
        }
      }
    if(max==Integer.MIN_VALUE) return 0;
      return max;
    }
}