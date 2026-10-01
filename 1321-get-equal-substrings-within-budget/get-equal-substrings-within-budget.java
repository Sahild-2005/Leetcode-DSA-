class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        // sliding window and 2 pointer 

        int n = s.length();
        int m = t.length();

        int i = 0;
        int j = 0;

        int cost = 0;
        int maxlen = 0;

        while (j < n) {

            char ch1 = s.charAt(j);
            char ch2 = t.charAt(j);

            int diff = Math.abs(ch1 - ch2);

            cost = cost + diff;

            while (cost > maxCost) {

                char ch1left = s.charAt(i);
                char ch2left = t.charAt(i);

                cost = cost - Math.abs(ch1left - ch2left);

                i++;
            }

            maxlen = Math.max(maxlen, j - i + 1);

            j++;
        }

        return maxlen;
    }
}