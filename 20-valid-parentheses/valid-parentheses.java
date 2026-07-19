class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch =='(' || ch =='[' || ch == '{'){
                st.push(ch);
            }
            else if(!st.isEmpty() && ch ==')' && st.peek() == '('){
                st.pop();
            }
            else if(!st.isEmpty() && ch==']' && st.peek() == '['){
                st.pop();
            }
            else if (!st.isEmpty() && ch=='}' && st.peek() == '{'){
                st.pop();
            }
            else{
                // empty stack or mismatch return false

                return false;
            }

        }

        if(st.isEmpty()){
            // if empty return true means balance 
            return true;
        }
      else  return false ; // if stack is not empty return false
    }
}