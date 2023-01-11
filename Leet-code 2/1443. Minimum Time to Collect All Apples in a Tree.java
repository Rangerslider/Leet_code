class Solution { 
    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int e = 0, len = edges.length; e < len; e++) {
            graph.putIfAbsent(edges[e][0], new ArrayList<>());
            graph.putIfAbsent(edges[e][1], new ArrayList<>());
            graph.get(edges[e][0]).add(edges[e][1]);
            graph.get(edges[e][1]).add(edges[e][0]);
        }
        boolean[] visited = new boolean[n];
        visited[0] = true;
        return dfs(0, hasApple, graph, visited);
    }
    
    private static int dfs(int u, List<Boolean> hasApple, HashMap<Integer, List<Integer>> graph, boolean[] visited) {
        int time = 0;
        for(int v : graph.get(u)) {
            if(!visited[v]) {
                visited[v] = true;
                time += dfs(v, hasApple, graph, visited);
            }
        }
        if(u == 0) return time;// if children have apples does not matter whether this node has apple or not we have to travel that node any way
        if (time > 0) return time + 2;// if children does not have apples then we wil traverse this node only
        return hasApple.get(u) ? 2 : 0;
    }
}