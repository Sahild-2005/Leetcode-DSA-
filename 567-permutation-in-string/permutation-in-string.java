class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;

        int right = 0;
        int size = s1.length();

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else {

                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
        }

            for (right = 0; right < s2.length(); right++) {

                char ch = s2.charAt(right);
                window.put(ch, window.getOrDefault(ch, 0) + 1);

                // maintain window
                while ((right - left + 1) > s1.length()) {
                    char leftChar = s2.charAt(left);

                    window.put(leftChar, window.get(leftChar) - 1);
                    if (window.get(leftChar) == 0) {
                        window.remove(leftChar);
                    }

                    left++;
                }

                // Compare maps when window size equals s1.length()
                if (window.equals(map)) {
                    return true;
                }

            }

        
        return false;
    }
}