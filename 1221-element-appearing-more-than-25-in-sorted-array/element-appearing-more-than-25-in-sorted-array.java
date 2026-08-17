class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;

        int occ = n / 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer ele : map.keySet()) {
            if (map.get(ele) > occ) {
                return ele;
            }
        }
        return -1;
    }
}