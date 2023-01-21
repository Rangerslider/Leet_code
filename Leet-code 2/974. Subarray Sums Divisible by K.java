class Solution {
    public int subarraysDivByK(int[] A, int k) {
          int[] map = new int[k];
          map[0] = 1;
    int count = 0, sum = 0;
    for (int a : A) {
        sum = (sum + a) % k;
        if (sum < 0) sum += k;
        count += map[sum];
        map[sum]++;
    }
    return count;
    }
}