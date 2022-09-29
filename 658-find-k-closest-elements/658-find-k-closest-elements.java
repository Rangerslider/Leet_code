class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int a = 0, b = arr.length - k;
        
        while (a < b)
        {
            int c = a + (b - a) / 2;
            
            if (x - arr[c] > arr[c + k] - x) a = c + 1;
            
            else b = c;
        }
        
        List<Integer> res = new ArrayList<>(k);
        
        while (k-- > 0) res.add(arr[a++]);
        
        return res;
    }
}