
class Solution {
  public int solve(int i, int n, int[] costs, int[] dp) {

        if(i==n) return 0;

        if(dp[i]!=-1) return dp[i];

        int cost = Integer.MAX_VALUE;

        for(int j=i+1;j<=Math.min(i+3,n);j++) {
            cost = Math.min(cost, costs[j-1] + (j-i)*(j-i) + solve(j,n,costs,dp));
        }

        return dp[i] = cost;
    }

    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,costs,dp);
    }
}
