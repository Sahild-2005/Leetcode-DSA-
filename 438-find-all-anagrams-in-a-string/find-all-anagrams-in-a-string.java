class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if (p.length() > s.length()) {
    return new ArrayList<>();
}
        
        // this question is of sliding window and hashmap 

        HashMap<Character,Integer> map2 = new HashMap<>();

        int left = 0;


        for(int i=0;i<p.length();i++){
            
            char ch = p.charAt(i);
            int freq = map2.getOrDefault(ch,0);

            map2.put(ch,freq+1);
        }

        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<p.length()-1;i++){
            char ch = s.charAt(i);
            int freq = map1.getOrDefault(ch,0);

            map1.put(ch,freq+1);

        }

        List<Integer> ans = new ArrayList<>();

        for( int right =p.length()-1;right<s.length();right++){
                
            char ch = s.charAt(right);
              int freq = map1.getOrDefault(ch,0);
              map1.put(ch,freq+1);

            if(map1.equals(map2)){
                    ans.add(left);
            }
                       char leftch = s.charAt(left);
                    int freqleft = map1.getOrDefault(leftch,0);

                    if(freqleft==1) map1.remove(leftch);
                    else map1.put(leftch,freqleft-1);
                    left++;

        }

         return ans;
    }
}
