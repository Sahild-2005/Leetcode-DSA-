class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        int low = 0;
        int high = arr.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        if (k == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }

        // find closest or equal element

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        high = low;
        low = high - 1;

        // an element that close to x 
        // find the starting low 

        while (k != 0) {
            if (low == -1) {
                high = high + 1;
            } else if (high == arr.length) {
                low = low - 1;

            } else if (Math.abs(arr[high] - x) < Math.abs(arr[low] - x)) {
                high = high + 1;
            } else {
                low = low - 1;
            }
            k--;
        }
        for (int j = low + 1; j < high; j++) {
            ans.add(arr[j]);
        }

        return ans;

    }
}