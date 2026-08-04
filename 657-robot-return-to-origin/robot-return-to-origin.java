class Solution {
    public boolean judgeCircle(String moves) {
        
        int moveH =0;
        int moveV =0;

        int n = moves.length();

        for(int i=0;i<n;i++){
            char ch = moves.charAt(i);

            if(ch=='U') moveH++;
            else if(ch=='D') moveH--;
            else if(ch=='R') moveV++;
            else moveV--;
        }

        return (moveH==0 && moveV==0);
    }
}