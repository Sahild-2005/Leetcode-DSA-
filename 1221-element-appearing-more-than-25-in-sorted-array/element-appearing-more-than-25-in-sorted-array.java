class Solution {
       public int searchRange(int[] arr, int target) {
        int n = arr.length;

        int[] ans = new int[2];

        // ll , ul

        int low = 0;
        int high = n - 1;

        int LL = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
              
                LL = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                // search right
                low = mid + 1;

            } else {
                // search left
                high = mid - 1;
            }
        }
        int UL = -1;
         low = 0;
         high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
              
                UL = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                // search right
                low = mid + 1;

            } else {
                // search left
                high = mid - 1;
            }
        }

        ans[0] = LL;
        ans[1] = UL;

       
        if (LL == -1) {
            return 0;
        }

        return UL - LL + 1;
    }
    
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        for(int i=0;i<n;i++){
            int freq = searchRange(arr,arr[i]);
            if(freq>n/4) return arr[i];
        }

        return -1;
    }
}