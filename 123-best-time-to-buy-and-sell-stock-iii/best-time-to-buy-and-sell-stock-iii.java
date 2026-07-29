class Solution {
    // recursion+memo
    int fun(int ind, int buy, int cap, int[] arr, int n, int[][][] dp) {
        // base case 
        if (cap == 0)
            return 0;
        if (ind == n)
            return 0;

            if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];

        // recurrence 
        if (buy == 1) { // buy , not buy
            dp[ind][buy][cap] = Math.max(-arr[ind] + fun(ind + 1, 0, cap, arr, n,dp),
                    0 + fun(ind + 1, 1, cap, arr, n,dp));
        }

        else { // sell  not sell
             dp[ind][buy][cap] = Math.max(arr[ind] + fun(ind + 1, 1, cap - 1, arr, n,dp),
                    0 + fun(ind + 1, 0, cap, arr, n,dp));
        }

        return  dp[ind][buy][cap] ;
    }

    public int maxProfit(int[] arr) {
        int n = arr.length;
        int[][][] dp = new int[n][2][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return fun(0, 1, 2, arr, n, dp);
    }
}