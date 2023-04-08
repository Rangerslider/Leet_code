class Solution {
    public int makeConnected(int n, int[][] connections) {
       //edge case - if we are given less than n-1 nodes to connect n nodes
 
        if(connections.length < n-1)
        return -1;
 
        /* 
        find no. of components in the graph(c) and assume them to be an 
        individual node , therefore we will need c-1 edges to connect them
        */
        int c = 0;
 
        //make a graph using HM
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();
        
        for(int connection[] : connections){
            int a = connection[0] , b = connection[1];
 
            graph.computeIfAbsent(a , k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b , k -> new ArrayList<>()).add(a);
        }
        
        //visited array 
        boolean visited[] = new boolean[n];
        
        //finding all components by using dfs on every node
 
        for(int i =0 ; i < n ; i++){
 
            if(visited[i] == false){
                
                if(graph.containsKey(i))
                dfs(graph , i , visited);
 
                c++;
 
            }
            
        }
 
        return c - 1;
 
        
    }
 
    public void dfs (HashMap<Integer,ArrayList<Integer>> graph , int source , 
    boolean[] visited ){
 
        
        visited[source] = true;
 
        for(int edge : graph.get(source)){
            if(visited[edge] == false)
            dfs(graph , edge , visited);
        }
 
        return ; 
    }
}