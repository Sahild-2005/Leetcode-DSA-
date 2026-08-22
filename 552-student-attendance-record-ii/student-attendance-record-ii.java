class Solution {
    public int solve(int n , int a , int l,int[][][] dp){

        // check if cond not saisfied dont give award
        if(a>1 || l>2) return 0;

        // base case 
        if(n==0) return 1;

        // all posibilty 

        if(dp[n][a][l]!=-1) return dp[n][a][l];

        // absent
        int absent = solve(n - 1, a + 1, 0,dp);
        // late 
        int late = solve(n - 1, a, l + 1,dp);

        // present 
       int present = solve(n - 1, a, 0,dp);

       // 10^9+7 
       
        return dp[n][a][l] =
            (int)(((long) absent + late + present) % 1000000007);
    }
    public int checkRecord(int n) {
        
        int[][][] dp = new int[n+1][2][3];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                java.util.Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(n,0,0,dp);

    }
}