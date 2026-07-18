class Solution {
    public String reverse(String s){
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
           char ch = s.charAt(i);

           rev = rev+ch;
        }

        return rev;
    }
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='*'){
                st.pop();
            }
            else st.push(ch);
        }

        String ans ="";
        while(!st.isEmpty()){
            ans = ans+st.pop();
        }

        return reverse(ans);
    }
}