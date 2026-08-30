class Solution {
    public int minimumDeletions(int[] arr) {
        int n = arr.length;

        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIdx]) {
                minIdx = i;
            }

            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        //  both from left
        int option1 = right + 1;

        // both from right
        int option2 = n - left;

        // one from left and one from right
        int option3 = (left + 1) + (n - right);

        return Math.min(option1, Math.min(option2, option3));
    }
}