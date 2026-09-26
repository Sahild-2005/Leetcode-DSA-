class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

   
        StringBuilder ans = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean bracketopen = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                bracketopen = true;
            } else if (ch == ')') {
                bracketopen = false;
          
                String value = map.getOrDefault(key.toString(), "?");
                ans.append(value);
                key.setLength(0); 
            } else if (bracketopen) {
                key.append(ch);
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}