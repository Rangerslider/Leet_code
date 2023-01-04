class Solution {
    public int minimumRounds(int[] tasks) { 
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>(); //create frequency map

        if(tasks.length<=1) {
             return -1;
        }//if length is less than or equals to 1 
           
        for(int task: tasks){
            map.put(task, map.getOrDefault(task,0)+1);
        }

        for(int count: map.values()){
            
            if(count==1)
                return -1;     //if frequenc  1 
           
            if(count%3==0){
                sum = sum + count/3;  //if the frequency  divided by 3
            }
           
            else if(count%3==1){
                sum = sum + (count-4)/3+2;
            }
           
            else if(count%3==2){
                sum = sum + (count-2)/3+1;
            }
        }
        
        return sum;
        
    }
}