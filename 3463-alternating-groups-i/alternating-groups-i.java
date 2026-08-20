class Solution {
    public int numberOfAlternatingGroups(int[] arr) {
        int n = arr.length;
        int count = 0;

   for (int i = 0; i < n; i++) {
            if (arr[i] != arr[(i + 1) % n] &&
                arr[(i + 1) % n] != arr[(i + 2) % n]) {
                count++;
            }
        }
        return count;
    }
}