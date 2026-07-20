class Solution {
    public int firstUniqueFreq(int[] arr) {

        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map1.containsKey(arr[i])) {
                map1.put(arr[i], 1);
            } else {
                int freq = map1.get(arr[i]);

                map1.put(arr[i], freq + 1);
            }

        }

        // now freq count store 
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (Integer value : map1.values()) {

            if (!map2.containsKey(value)) {
                map2.put(value, 1);
            } else {
                int freq = map2.get(value);
                map2.put(value, freq + 1);
            }
        }
        for (int num : arr) {
            int freq = map1.get(num);

            if (map2.get(freq) == 1) {
                return num;
            }
        }

        return -1;

    }
}