class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n + 1][2];

        // dp[n][0] = dp[n][1] = 0 (already initialized)

        for (int ind = n - 1; ind >= 0; ind--) {

            // buy == 1
            dp[ind][1] = Math.max(
                    -prices[ind] + dp[ind + 1][0], // Buy
                    dp[ind + 1][1]                 // Skip
            );

            // buy == 0
            dp[ind][0] = Math.max(
                    prices[ind] + dp[ind + 1][1], // Sell
                    dp[ind + 1][0]                // Hold
            );
        }

        return dp[0][1];
    }
}