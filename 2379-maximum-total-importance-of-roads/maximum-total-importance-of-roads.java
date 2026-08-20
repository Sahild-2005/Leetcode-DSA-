class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // first we count have many connections is required for each city 
        // based on it most no of connections means road is that much equally important 

        int[] count = new int[n];
        Arrays.fill(count,0);    

        int row = roads.length;
        int col = roads[0].length;

        for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    int city = roads[i][j];
                    count[city]+=1 ;
                }
        }

    Arrays.sort(count);

        long ans = 0;

        for(int i = 0; i < n; i++){
             ans += (long) count[i] * (i + 1);
            }


        return ans;
    }
}