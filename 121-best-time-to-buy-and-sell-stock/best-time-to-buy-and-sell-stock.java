class Solution {
    public int maxProfit(int[] arr) {
        // dp om stocks 
        // keep track of min price 

        int profit=0;
        int n = arr.length;
        int mini = arr[0];
            for(int i=1;i<n;i++){
            int cost = arr[i] - mini;

            profit = Math.max(cost,profit);

            // store mini
            mini = Math.min(mini,arr[i]);
        }

        return profit;
    }
}