class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> dict = new HashMap<>();
        for(int i = 0; i < s.length(); i ++){
            dict.put(s.charAt(i), dict.getOrDefault(s.charAt(i),0)+1);
            dict.put(t.charAt(i), dict.getOrDefault(t.charAt(i),0)-1);
        }

        for(Character c : dict.keySet()){
            if(dict.get(c) != 0){
                return false;
            }
        }

        return true;
    }
}
