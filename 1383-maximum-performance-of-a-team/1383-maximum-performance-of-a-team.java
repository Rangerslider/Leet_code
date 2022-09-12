class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k)
    {
        int mod = 1000000007;
        //Creating array having both speed and efficiency value wrt their index
        
        int[][] p = new int[n][2];          //p= parform value here 
        
        for(int i=0 ; i<n ; i++)
        {
            p[i][0] = efficiency[i];
            p[i][1] = speed[i];
        }
        
        
        //Sorting the pair array wrt to efficiency value inn decreasinng order
        Arrays.sort(p, (a, b) -> b[0] - a[0]);
        
        long maxPerformence = Long.MIN_VALUE;
        
        PriorityQueue<Integer> topPerformer = new PriorityQueue<>();
        long sum = 0;
        
        for(int i=0 ; i<n ; i++)
        {
            //Update the sum
            sum += p[i][1];
            topPerformer.add(p[i][1]);
            
            
            //If size exceeds K thenn removing smallest value of speed
            if(topPerformer.size() > k) sum -= topPerformer.remove();
            long performence = (sum * p[i][0]);
            
            
            //Updating max Performence
            maxPerformence = Math.max(maxPerformence, performence);
        }
        
        return (int)(maxPerformence % mod);
    }
}