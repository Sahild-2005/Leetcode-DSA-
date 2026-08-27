class Solution {
    private int find(int[] freq) {
    int max = 0;

    for (int i = 0; i < 26; i++) {
        max = Math.max(max, freq[i]);
    }

    return max;
}
    public int characterReplacement(String s, int k) {
        int low = 0;
        int[] freq = new int[26];
        int ans = 0;

        for (int high = 0; high < s.length(); high++) {

            freq[s.charAt(high) - 'A']++;

            int len = high - low + 1;
            int max = find(freq);
            int diff = len - max;

            while (diff > k) {
                freq[s.charAt(low) - 'A']--;
                low++;

                len = high - low + 1;
                max = find(freq);
                diff = len - max;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}