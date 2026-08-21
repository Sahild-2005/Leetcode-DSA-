class Solution {
    public int[] getSumAbsoluteDifferences(int[] arr) {
        
    int totalSum = 0;
    int n = arr.length;
    int leftSum = 0;

    for(int i=0;i<n;i++) totalSum+=arr[i];

    int[] ans = new int[n];
    for(int i=0;i<n;i++){
        int left = (arr[i]*i) - leftSum;

        int right = (totalSum - leftSum - arr[i]*(n-i));
        
        leftSum += arr[i];
        ans[i] = left+right;
    }

    return ans;

    }
}