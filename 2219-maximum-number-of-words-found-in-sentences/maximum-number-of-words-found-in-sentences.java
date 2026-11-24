class Solution {
    public int mostWordsFound(String[] s) {
        
        int count ;

        int max = Integer.MIN_VALUE;

        int n = s.length;

        for(int i=0;i<n;i++){
             count=0;
            for(int j=0;j<s[i].length();j++){
                char ch = s[i].charAt(j);

                if(ch==' ') count++;
            }

            max = Math.max(count,max);
           
        }

        return max+1;
    }
}