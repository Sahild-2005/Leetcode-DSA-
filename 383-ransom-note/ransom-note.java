class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character , Integer> map1 = new HashMap<>();

        HashMap<Character , Integer> map2 = new HashMap<>();

        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
              int freq = map1.getOrDefault(ch, 0);
            map1.put(ch, freq + 1);
        }
          for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
              int freq = map2.getOrDefault(ch, 0);
            map2.put(ch, freq + 1);
        }

            for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char ch = entry.getKey();
            int ransomFreq = entry.getValue();

            int magazineFreq = map2.getOrDefault(ch, 0);

            if (magazineFreq < ransomFreq) {
                return false;
            }
        }
        return true;
    }
}