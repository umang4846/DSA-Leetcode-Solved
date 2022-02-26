class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!Character.isDigit(ch1) &&!Character.isAlphabetic(ch1)){
                i++;
            }else if(!Character.isDigit(ch2) && !Character.isAlphabetic(ch2)){
                j--;
            }
            else if(Character.toLowerCase(ch1) == Character.toLowerCase(ch2)){
                i++;
                j--;
            }else if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)){
                return false;
            }
        }
        return true;
    }
   
}
