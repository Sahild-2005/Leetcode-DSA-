class Solution {
    public boolean digitCount(String arr) {
        
        HashMap<Character , Integer> map = new HashMap<>();

     int n = arr.length();

     for(int i=0;i<n;i++){
        char ch = arr.charAt(i);

        int freq = map.getOrDefault(ch,0);

        map.put(ch,freq+1);
     }

     Boolean flag = true;

     for(int i=0;i<n;i++){
        char ch = arr.charAt(i);
        int digit = arr.charAt(i) - '0';

       if(map.getOrDefault((char)('0' + i), 0) != digit)
            flag = false;
     }

     return flag;
    }
}