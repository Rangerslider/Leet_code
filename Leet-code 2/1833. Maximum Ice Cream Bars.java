// counting sort 
class Solution {
    public int maxIceCream(int[] cost, int coins) {
        int n = cost.length;
        int ice= 0;
        int max = cost[0];
        for(int c: cost){
            max = Math.max(max , c);
        }
        int []cost1 = new int [max+1];
        for(int c: cost){
            cost1[c]++;
        }
        for(int c =1; c<=max ; ++c){
            if(cost1[c]== 0 ){ //no icecream 
                continue;
            }
            if(coins <c ){// not enough money to bye icecream 
                break;
            }
            int count = Math.min(cost1[c],coins/c);
            coins -= c*count;
             ice += count;
        }
        return ice;
        
    }
}
// counting sort 
// Time: O(n\log n)
//Space: O(1)

/*class Solution {
    public int maxIceCream(int[] costs, int coins) {
     Arrays.sort(costs);

    for (int i = 0; i < costs.length; ++i)
      if (coins >= costs[i])
        coins -= costs[i];
      else
        return i;

    return costs.length;
    }
}*/