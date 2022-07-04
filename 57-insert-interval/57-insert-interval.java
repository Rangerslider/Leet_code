class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
          final int n = intervals.length;
    List<int[]> nuri = new ArrayList<>();
    int i = 0;
    while (i < n && intervals[i][1] < newInterval[0])
      nuri.add(intervals[i++]);
        
    while (i < n && intervals[i][0] <= newInterval[1]) {
        
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      ++i;
    }
    nuri.add(newInterval);
    while (i < n)
      nuri.add(intervals[i++]);
        
    return nuri.toArray(new int[nuri.size()][]);
    }
}