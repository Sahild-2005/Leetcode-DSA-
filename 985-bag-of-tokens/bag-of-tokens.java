class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        
        int score =0;
        int max = 0;
        Arrays.sort(arr);

        int n = arr.length;
        if(n==0) return 0;
        int i =0;
        int j = n-1;

        while(i<=j){
            if(arr[i]<=power){
                // score up 
                power = power-arr[i];
                score = score+1;
                i++;
                  max = Math.max(max,score);
            }
            else if(score > 0){
                // score down 
                power = power+arr[j];
                j--;
              
                score= score-1;
            }
            else{
                break;
            }
          
        }
      
        return max;
    }
}