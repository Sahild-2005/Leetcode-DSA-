class Solution {
    public int equalPairs(int[][] grid) {
        
        // brute 

        int row =0;
        int col =0;
        int count=0;

        for( row= 0;row<grid.length;row++){
       
            for(col = 0;col<grid[0].length;col++){
                         Boolean isEqual = true;
                for(int i=0;i<grid.length;i++){
                    if(grid[row][i]!=grid[i][col]) {
                        isEqual = false; 
                        break;
                    }

                }
                 if(isEqual) count++;
            }

        }
        return count;
    }
}