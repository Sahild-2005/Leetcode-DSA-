class Solution {
    // dp + memo
    public int fun(int ind , int buy ,int[] arr,int[][] dp){

        // base case 

        if(ind==arr.length){
            return 0;
        }
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit =0;
        if(buy==1){
            // buy  1 --> yes 0--> no
        profit = Math.max(-arr[ind]+fun(ind+1,0,arr,dp),
                        0+ fun(ind+1,1,arr,dp));
        }
        else{
                // sell
                profit = Math.max(arr[ind]+fun(ind+1,1,arr,dp),
                            0+fun(ind+1,0,arr,dp));

        }

        return dp[ind][buy] = profit ;
    }

    public int maxProfit(int[] arr) {
        int[][] dp = new int[arr.length][2];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return fun(0, 1, arr,dp);
    }
}