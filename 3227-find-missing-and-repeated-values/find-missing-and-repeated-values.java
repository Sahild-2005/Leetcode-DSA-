class Solution {
    public int[] findMissingAndRepeatedValues(int[][] arr) {
        
        // first find total sum 
        // then find req sum using formula n(n+1)/2
        int[] ans = new int[2];

        int n = arr.length;
        int N = n * n;
        int reqsum = N*(N+1)/2;
        
        int sum =0;

        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                    sum = sum+arr[i][j];
            }
        }

        HashSet<Integer> set = new HashSet<>();

            int repeat =0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                    if(set.contains(arr[i][j])){
                        repeat = arr[i][j];
                      
                    }
                    else set.add(arr[i][j]);
            }
        }

        sum = sum-repeat;
        int missing = reqsum-sum;
        ans[0] = repeat;
        ans[1] = missing;
        return ans;
    }
}