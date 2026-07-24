class Solution {
        public static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length; // Notice: high is set to arr.length, not arr.length - 1

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid; // Look on the left side (including mid)
            } else {
                low = mid + 1; // Look on the right side
            }
        }
        return low; // or return high, as low == high
    }
    public int searchInsert(int[] arr, int target) {
        
        return lowerBound(arr,target);
    }
}