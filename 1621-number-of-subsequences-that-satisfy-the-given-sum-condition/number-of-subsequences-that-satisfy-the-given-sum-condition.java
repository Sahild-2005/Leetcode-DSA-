class Solution {
    public int numSubseq(int[] arr, int target) {

        int n = arr.length;
        int MOD = 1000000007;

        Arrays.sort(arr);

        long count = 0;

        long[] power = new long[n];
        power[0] = 1;

        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        for (int i = 0; i < n; i++) {

            int min = arr[i];
            int j = i;

            while (j < n && min + arr[j] <= target) {
                j++;
            }

            j--;

            if (j >= i) {
                count = (count + power[j - i]) % MOD;
            }
        }

        return (int) count;
    }
}