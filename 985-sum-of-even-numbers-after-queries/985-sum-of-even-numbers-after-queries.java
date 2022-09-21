class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[queries.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (((A[i] & 1) == 0)) {
                sum += A[i];
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            if ((A[index] & 1) == 0) {
                sum -= A[index];
            }
            A[index] = A[index] + val;
            if ((A[index] & 1) == 0) {
                sum += A[index];
            }
            res[i] = sum;
        }
        return res;
    }
}