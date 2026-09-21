class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        Arrays.sort(hand);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

        for (int i = 0; i < hand.length; i++) {

            int first = hand[i];

            if (!map.containsKey(first)) {
                continue;
            }

            for (int j = 0; j < groupSize; j++) {

                int num = first + j;

                if (!map.containsKey(num)) {
                    return false;
                }

                map.put(num, map.get(num) - 1);

                if (map.get(num) == 0) {
                    map.remove(num);
                }
            }
        }

        return true;
    }
}