class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();

        if(n!=m) return false;

        // freq 
        // hashmap 

        HashMap <Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        // map 1 

        for(int i=0;i<n;i++){
            char ch = word1.charAt(i);
                int freq = map1.getOrDefault(ch,0);

                map1.put(ch,freq+1);
        }
        
        // map2 

             for(int i=0;i<n;i++){
            char ch = word2.charAt(i);
                int freq = map2.getOrDefault(ch,0);
                map2.put(ch,freq+1);
        }

        // now check value of hashmap 

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
}

HashMap<Integer, Integer> freq1 = new HashMap<>();
HashMap<Integer, Integer> freq2 = new HashMap<>();

for (int value : map1.values()) {
    freq1.put(value, freq1.getOrDefault(value, 0) + 1);
}

for (int value : map2.values()) {
    freq2.put(value, freq2.getOrDefault(value, 0) + 1);
}

return freq1.equals(freq2);
    }
}