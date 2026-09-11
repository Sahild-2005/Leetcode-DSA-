class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        // flush checks suits 
        // three of kind checks ranks 
        // pair checks rank
        // if not all then highcard

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < suits.length; i++) {
            char ch = suits[i];
            int freq = map.getOrDefault(ch, 0);
            map.put(ch, freq + 1);
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() == 5)
                return "Flush";
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();

        int maxFreq = 0;
        for (int i = 0; i < ranks.length; i++) {
            int freq = map2.getOrDefault(ranks[i], 0) + 1;
            map2.put(ranks[i], freq);
            maxFreq = Math.max(maxFreq, freq); 
        }

        if (maxFreq >= 3)
            return "Three of a Kind"; 
        if (maxFreq == 2)
            return "Pair";
        return "High Card";

    }
}