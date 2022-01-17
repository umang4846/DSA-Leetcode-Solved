class Solution {
    public boolean wordPattern(String pattern, String s) {
        int start = 0;
        String[] arr = s.split(" ");
        if(arr.length != pattern.length()){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        while(start < arr.length){
            char ch = pattern.charAt(start);
            if(map.get(ch) != null && !map.get(ch).equals(arr[start])){
                return false;
            }
            if(map.containsValue(arr[start]) && map.get(ch) == null){
                return false;
            }
            map.put(ch,arr[start]);
            start++;
        }
        return true;
    }
}