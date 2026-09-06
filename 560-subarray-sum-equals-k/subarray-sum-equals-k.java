class Solution {
    public int subarraySum(int[] arr, int k) {

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int que = (sum - k);
            int freq = map.getOrDefault(que, 0);

            result = result + freq;

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return result;
    }
}