
class Solution {
    public int sumCounts(List<Integer> arr) {

        int sum = 0;
        int n = arr.size();

        for (int i=0; i<n; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j=i; j<n; j++) {
                int freq = map.getOrDefault(arr.get(j), 0);
                map.put(arr.get(j), freq + 1);

                sum = sum + (map.size() * map.size());
            }
        }

        return sum;
    }
}
