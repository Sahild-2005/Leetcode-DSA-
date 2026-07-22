class Solution {
    public int fun(int i,int j,String s,String t,int[][] dp){

        // base case 
        if(j<0) return 1;
        if(i<0) return 0;

        // match 
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j] = fun(i-1,j-1,s,t,dp) + fun(i-1,j,s,t,dp);
        }
        else{
            // not match 
            return dp[i][j] = fun(i-1,j,s,t,dp);
        }
    }
    public int numDistinct(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        // recursion + memo 
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return fun(n-1,m-1,s,t,dp);
    }
}