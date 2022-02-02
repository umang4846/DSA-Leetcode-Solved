class Solution {
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        long cur = 0, pk = 1;
        int res = 0, n = s.length();
        for (int i = n - 1; i >= 0; --i) {
            cur = (cur * power + s.charAt(i) - 'a' + 1) % modulo;
            if (i + k >= n)
                pk = pk * power % modulo;
            else
                cur = (cur - (s.charAt(i + k) - 'a' + 1) * pk % modulo + modulo) % modulo;
            if (cur == hashValue)
                res = i;
        }
        return s.substring(res, res + k);
    }
}