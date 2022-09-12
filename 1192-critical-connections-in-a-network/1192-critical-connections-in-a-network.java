class Solution {
    int[] d, l; //d= disk,l=low
    int t = 1; //t= time 
    
    List<List<Integer>> ans = new ArrayList<>();
    Map<Integer,List<Integer>> edgeMap = new HashMap<>();
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        d = new int[n];
        l = new int[n];
        
        for (int i = 0; i < n; i++)
            edgeMap.put(i, new ArrayList<Integer>());
        
        for (List<Integer> conn : connections) {
            
            edgeMap.get(conn.get(0)).add(conn.get(1));
            edgeMap.get(conn.get(1)).add(conn.get(0));
        }
        
        dfs(0, -1);
        return ans;
    }
    
    public void dfs(int c, int p) { //c= current ,p = previous 
        
        d[c] = l[c] = t++;
        
        for (int next : edgeMap.get(c)) {
            
            if (d[next] == 0) {
                dfs(next, c);
                l[c] = Math.min(l[c], l[next]);
            } 
            else if (next != p)
                l[c] = Math.min(l[c], d[next]);
            
            if (l[next] > d[c]) 
                ans.add(Arrays.asList(c, next));
        }
    }
}