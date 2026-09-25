class Solution {
    public int longestBeautifulSubstring(String s) {

        int n = s.length();
        int left = 0;
        int count = 1;
        int max = 0;

        for (int right = 1; right < n; right++) {

            if (s.charAt(right) == s.charAt(right - 1)) {
                
            }
            else if (s.charAt(right) > s.charAt(right - 1)) {
                count++;
            }
            else {
                left = right;
                count = 1;
            }

            if (count == 5) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max;
    }
}