class Solution {
    public boolean detectCapitalUse(String word) {
        char ch = word.charAt(0);
        if(ch >= 65 && ch <= 90){
            if(word.length() == 1){
                return true;
            }
            return isCapital(word.substring(1)) || isSmall(word.substring(1));
        }else if(ch >= 97 && ch <= 122){
            return isSmall(word);
        }
        return false;
            
    }
    private boolean isCapital(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) < 65 || s.charAt(i) > 90){
                return false;
            }
        }
        return true;
    }
    private boolean isSmall(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) < 97 || s.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }
}