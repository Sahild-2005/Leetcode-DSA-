class Solution {
    public static boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--; 
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        int maxLength = 0;
        int startIndex = 0;

     
        for (int i=0;i<s.length();i++) {
            for (int j = i;j<s.length();j++) {
                if (isPalindrome(i, j, s)) {
                    int currentLength = j - i + 1;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        startIndex = i;
                    }
                }
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }
}