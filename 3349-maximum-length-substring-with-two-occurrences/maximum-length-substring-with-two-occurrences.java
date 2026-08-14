class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> st = new HashMap<>();

        int count = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char rightch = s.charAt(j);
           int freq = st.getOrDefault(rightch, 0);
                st.put(rightch, freq + 1);

            while (st.get(rightch) > 2) {
                char leftch = s.charAt(i);
                st.put(leftch, st.get(leftch) - 1);
                i++;
            }
        count = Math.max(count,(j-i+1));
        }

        return count;
    }
}