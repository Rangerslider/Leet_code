class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
        return 0;
    }
    // sort by end in ascending order
    Arrays.sort(points, new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            // in case of overflow
            if (o1[1] == o2[1]) {
                return 0;
            } else if (o1[1] > o2[1]) {
                return 1;
            } else {
                return -1;
            }
        }
    });
    int prevEnd = points[0][1];
    int numArrow = 1;
    for (int[] point : points) {
        if (point[0] > prevEnd) { // no overlap
            numArrow++;
            prevEnd = point[1];
        }
    }
    return numArrow;

    }
}

// tc=O(n log n )
// sc = O(N) / O(log N)