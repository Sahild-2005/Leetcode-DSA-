class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            int freq = map.getOrDefault(ch,0);

            map.put(ch,freq+1);

        } 

        // search in s string 

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            int freq = map.get(ch);

            if(freq==1) return i;
        }

        return -1;
    }
}