class Solution {
        ArrayList<String> ans ;
    public void fun(int open , int close , int n , String s){

            // base

            if(s.length()==2*n){
                ans.add(s);
                return;
            }

            // work to be done      
            // open fun and close fun

            // open 

           if(open<n) fun(open+1,close,n,s+"(");

        // close
           if(open>close) fun(open,close+1,n,s+")");


    }
    public List<String> generateParenthesis(int n) {
        
        ans = new ArrayList<>();

        fun(0,0,n,"");
        return ans;
        
    }
}