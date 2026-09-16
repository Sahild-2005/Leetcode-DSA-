class Solution {
    public boolean canReorderDoubled(int[] arr) {

       HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }


        Integer[] nums = new Integer[arr.length];

           for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }


          Arrays.sort(nums, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));

                 for (int i = 0; i < nums.length; i++) {

            int x = nums[i];

            if (map.get(x) == 0) {
                continue;
            }

            int doubleValue = 2 * x;

            if (map.getOrDefault(doubleValue, 0) == 0) {
                return false;
            }

            map.put(x, map.get(x) - 1);
            map.put(doubleValue, map.get(doubleValue) - 1);
        }

        return true;
    }
}