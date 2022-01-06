class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        helper(s, 0, temp, res);
        return res;
    }

    private void helper(String s, int start, List<String> temp, List<List<String>> res) {
        if (s.length() == start) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i+1);
            if (isPalindrome(sub)) {
                temp.add(sub);
                helper(s, i + 1, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}