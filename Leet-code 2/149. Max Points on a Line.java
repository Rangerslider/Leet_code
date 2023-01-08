class Solution {
    public int maxPoints(int[][] points) {
        int n= points.length;
        int res = 2;
        if(n== 1){
            return 1;
        }
        for (int i = 0; i<n; i++){
            Map<Double , Integer > a = new HashMap<>();
            for (int j = 0; j<n; j++){
                if (j!= i){
                    a.merge(Math.atan2(points[j][1] - points[i][1] , points[j][0] - points[i][0]),1,Integer::sum);
                }
            }
            res= Math.max(res , Collections.max(a.values()) +1);
        }
        return res;
    }
}
//tc: O(n^2)for each point o(n)& atan it tooks O(n)
//sc: O(n)