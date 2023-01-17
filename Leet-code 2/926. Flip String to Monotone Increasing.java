class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int flipCount = 0;
        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                if (oneCount == 0)
                    continue;
                flipCount++;
            } else
                oneCount++;
            if (oneCount < flipCount)
                flipCount = oneCount;
        }
        return flipCount;

    }
}
