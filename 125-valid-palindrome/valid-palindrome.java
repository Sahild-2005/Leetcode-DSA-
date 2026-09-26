class Solution {
    public boolean isPalindrome(String s) {
        
        // remove gaps and spaces 
        String word = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           ch =  Character.toLowerCase(ch);
           if(Character.isLetterOrDigit(ch)){
                word+=ch;
            }
        }

        int i=0;
        int j = word.length()-1;

        while(i<=j){
            if(word.charAt(i)!=word.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}