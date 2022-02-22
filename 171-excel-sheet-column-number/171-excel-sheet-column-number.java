class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int length = 0;
        for(int i = columnTitle.length()-1; i>=0;i--){
            int charInt = (int) (columnTitle.charAt(i) - 'A') + 1;
            ans += (int) Math.pow(26,length) * charInt;
            length++;
        }
        return ans;
    }
}