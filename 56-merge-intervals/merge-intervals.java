class Solution {
    public int[][] merge(int[][] arr) {
        
        // sorting the array (start values )

        Arrays.sort(arr,(a,b)->a[0]-b[0]);  // sort by starting 0 start index

        ArrayList<int[]> result = new ArrayList<>();

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } else {
                result.add(new int[]{start, end});

                start = arr[i][0];
                end = arr[i][1];
            }
        }

         result.add(new int[]{start, end});

         return result.toArray(new int[result.size()][]);

    }
}