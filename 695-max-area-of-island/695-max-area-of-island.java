class Solution {
    boolean seen [][];  
        
    public int maxAreaOfIsland(int[][] g) {
         int max_area = 0 ;
        
        int r = g.length;                   //r=row,c= column ,g= grid 
        int c = g [0].length;
        
        seen = new boolean [r] [c];
        
        for ( int i=0;i<r;i++){
            for (int j =0;j<c;j++){
                max_area =Math.max (max_area,area(i,j,g));
                
            }
        }
        return max_area;
    }
    
    public int area (int r,int c, int [][]g ){
        
        if (r<0 || r>= g .length || c<0 || c>= g[r].length|| seen[r][c] || (g [r][c]== 0)){
            
            return 0;
        }
        
        seen [r][c]= true;
        
        return (1 +  area(r+1,c,g)+ area (r-1,c,g)+area(r,c-1,g)+ area (r,c+1,g));
    }
}