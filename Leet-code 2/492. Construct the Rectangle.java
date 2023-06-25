class Solution {
    public int[] constructRectangle(int area) {
        int sqr = (int)Math.sqrt(area);
        int[] item1 = new int[2];
        int[] item2 = new int[2];
        for(int i=sqr;i>=0;i--){
            if(area%i==0){
                item1[0]=Math.max(i, area/i);
                item1[1]=Math.min(i, area/i);
                break;
            }
        }
        for(int i=sqr+1;i<area;i++){
            if(area%i==0){
                item2[0] = Math.max(i, area / i);
                item2[1] = Math.min(i, area / i);
                break;
            }
        }
        if(item1[0]==0){
            return item2;
        }
        if(item2[0]==0){
            return item1;
        }
        if(item1[0]-item1[1]>=item2[0]-item2[1]){
            return item2;
        }
        else{
            return item1;
        }
    }
}