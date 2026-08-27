class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        int sum =0;

        int high =0;
        int low =0;
        int min = Integer.MAX_VALUE;
        int ans=0 ;

        for(high=0;high<arr.length;high++){
            sum= sum+arr[high];

            while(sum>=target){
                int len = high-low+1;
                min = Math.min(min,len);
                ans = min;
                sum = sum-arr[low];
                low++;
            }
        }
        return ans;
    }
}