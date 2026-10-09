class Solution {
    public void setZeroes(int[][] arr) {
        
             int n = arr.length,m=arr[0].length;
        // find row and coloumn where is zero 
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==true){
                    arr[i][j] = 0;

                }
                if(col[j]==true){
                    arr[i][j] =0;
                }
            }
        }

    }
}