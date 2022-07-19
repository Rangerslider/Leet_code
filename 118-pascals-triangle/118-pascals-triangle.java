class Solution {
    public List<List<Integer>> generate(int r) {
        
        List<List<Integer>> a = new ArrayList<>();
        
        for ( int i =0; i< r; ++i){
            
            Integer[]temp = new Integer [i+1];
            
            Arrays.fill(temp,1);
            
            a.add(Arrays.asList(temp));
            
        }
        for (int i =2; i<r; ++i)
            
      for (int j = 1; j < a.get(i).size() - 1; ++j)
          
        a.get(i).set(j, a.get(i - 1).get(j - 1) + a.get(i - 1).get(j));
        
    return a;
    }
}
