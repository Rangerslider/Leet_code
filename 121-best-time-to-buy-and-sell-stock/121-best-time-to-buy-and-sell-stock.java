class Solution {
    public int maxProfit(int[] p) {// p- prices  
        
        if(p==null||p.length<=1)
        return 0;
 
    int min=p[0];  
    int r=0;
 
    for(int i=1; i<p.length; i++){

        r = Math.max(r, p[i]-min);
        min = Math.min(min, p[i]);
    }
 
    return r;
    }
}