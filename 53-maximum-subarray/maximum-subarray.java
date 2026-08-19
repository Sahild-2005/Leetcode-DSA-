class Solution {
    public int maxSubArray(int[] arr) {

        int n = arr.length;
        if (n == 1)
            return arr[0];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];
            maxSum = Math.max(sum, maxSum);

            if (sum < 0) {
                // negative 
                sum = 0;
            }

        }
        return maxSum;
    }
}