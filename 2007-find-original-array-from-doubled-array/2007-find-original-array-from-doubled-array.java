class Solution {
    public int[] findOriginalArray(int[] c) { //c= changed
        if (c.length %2 !=0)
            return new int [0];
        
        int max = Integer.MIN_VALUE;
        
         for (int num:c)
             max=Math.max(max,num);
        
        if (max%2 !=0) 
            return new int[0];
        
        int counts[]=new int [max+1];
        
        for(int num :c)
            counts[num]++;
        
        int org[] =new int [c.length/2];
        
        if (counts [0]%2 !=0)
            return new int[0];
        
        int index= counts [0]/2;
        
        for (int i =1 ;i<counts.length;i++)
        {
            if (counts[i]==0)
                continue;
            
            if (2*i>max || counts[i]> counts[i+i])
                return new int [0];
            
            int count =counts[i];
            counts [i+i] -= count ;
            
            while (count -->0)
                org[index++]=i;
        }
        return org;
    }
}