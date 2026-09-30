class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        

        // if we get 2 brackets opening we have put in group2 

        // else we put in group 1 


        int n = seq.length();
        int curr =0;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            char ch = seq.charAt(i);

            if(ch=='('){
                
                 if (curr % 2 == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
                curr++;
            }
            if(ch==')'){
                   curr--;
                if (curr % 2 == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
             
            }
        }
        return ans;
    }
}