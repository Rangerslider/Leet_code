class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> num = new HashSet<>();
        for (String code : dictionary) {
            num.add(code);
        }
        int n = s.length();
        int[] m = new int[n + 1];
        m[0] = 0;
        for (int i = 1; i <= n; ++i) {
            m[i] = m[i - 1] + 1;
            for (int j = 0; j < i; ++j) {
                if (num.contains(s.substring(j, i))) {
                    m[i] = Math.min(m[i], m[j]);
                }
            }
        }
        return m[n];
    }
}