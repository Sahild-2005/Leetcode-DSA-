class Solution {
    public int longestConsecutive(int[] arr) {
        // hashmap apporach 

        // put every element in hash set 
        // count using for loop 

        HashSet<Integer> set = new HashSet<>();

        int n = arr.length;
    if(n==0) return 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i]))
                set.add(arr[i]);
        }
        int maxCount = Integer.MIN_VALUE;
        for (int num : set) {

            // Start counting only if num is the first element
            if (!set.contains(num - 1)) {

                int count = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}