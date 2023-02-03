class SummaryRanges {

    class Interval {
        int start, end;
        Interval(int l, int r) {
            start = l;
            end   = r;
        }
    }
    
    HashMap<Integer, Integer> treeBounds;
    TreeMap<Integer, Interval> treeIntervals;
    
    public SummaryRanges() {
        treeBounds = new HashMap<>();
        treeIntervals = new TreeMap<>();
    }
    
    public void addNum(int val) {
        if(treeBounds.containsKey(val)) return;
        if(!treeBounds.containsKey(val-1) && !treeBounds.containsKey(val+1)) {
            treeBounds.put(val, val);
            treeIntervals.put(val, new Interval(val, val));
            return;
        }
        int left = treeBounds.containsKey(val - 1)?treeBounds.get(val - 1):val;
        int right = treeBounds.containsKey(val + 1)?treeIntervals.get(val + 1).end:val;
        treeBounds.put(val, left);
        treeBounds.put(right, left);
        treeIntervals.remove(val + 1);
        treeIntervals.put(left, new Interval(left, right));
    }
    
    public int[][] getIntervals() {
        int[][] retArray = new int[treeIntervals.size()][2];
        int index = 0;
        for(int key: treeIntervals.keySet()) {
            retArray[index][0] = treeIntervals.get(key).start;
            retArray[index++][1] = treeIntervals.get(key).end;
        }
        return retArray;
    }
}