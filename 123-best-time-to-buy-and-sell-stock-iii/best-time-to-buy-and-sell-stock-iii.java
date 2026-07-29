class Solution {
    // tabultaion 
    public int maxProfit(int[] arr) {

        int n = arr.length;

        int[][][] dp = new int[n+1][2][3];

        int ind, buy, cap;

        // 2 base case 

        for (ind = 0; ind < n; ind++)
            for (buy = 0; buy <= 1; buy++)
                dp[ind][buy][0] = 0;

        for (buy = 0; buy <= 1; buy++)
            for (cap = 0; cap <= 2; cap++)
                dp[n][buy][cap] = 0;

        for (ind = n - 1; ind >= 0; ind--) {
            for (buy = 0; buy <= 1; buy++) {
                for (cap = 1; cap <= 2; cap++) {
                    if (buy == 1) { // buy , not buy
                        dp[ind][buy][cap] = Math.max(-arr[ind] + dp[ind+1][0][cap],
                                0 + dp[ind+1][1][cap]);
                    }

                    else { // sell  not sell
                        dp[ind][buy][cap] = Math.max(arr[ind] + dp[ind+1][1][cap-1],
                                0 + dp[ind+1][0][cap]);
                    }
                }
            }
        }

        return dp[0][1][2];

    }
}