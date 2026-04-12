class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> dict = new HashMap<>();
        for(int i=0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            System.out.println(c);

            String value = String.valueOf(c);
            System.out.println("value - " +value);

            if(!dict.containsKey(value)){
                dict.put(value, new ArrayList<>());
            }
            dict.get(value).add(strs[i]);

        }

        return new ArrayList<>(dict.values());
    }
}
