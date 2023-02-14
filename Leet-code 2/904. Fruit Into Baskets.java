class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
         int l=0;//left=l
         int ans = 0;

         for(int r =0; r<fruits.length; r++) {
             basket.put(fruits[r],basket.getOrDefault(fruits[r], 0) + 1);
             if(basket.size()>2){
                 basket.put(fruits[l],basket.get(fruits[l]) -1);
                 if(basket.get(fruits[l])==0){
                     basket.remove(fruits[l]);
                 }
                 l++;
             }
              ans=Math.max(ans, r-l+1 );
         }
           return ans;
    }
   
}