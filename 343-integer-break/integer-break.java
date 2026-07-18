class Solution {
    public int solve(int n,int[] dp){
   

        if(dp[n]!=-1) return dp[n];
        int result = 0;        
        for(int i=1;i<n;i++){
            int prod = Math.max(i*(n-i),i* solve((n-i),dp));

            result = Math.max(result,prod);
        }

        return dp[n] = result;
    }
    public int integerBreak(int n) {
              // dp 
        int[] dp = new int[n+1];
             Arrays.fill(dp,-1);

             return solve(n,dp);
       
    }
}