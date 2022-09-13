​Mainly ekta array te different day r prices dea ase amader sei price e ekdom minimum cost value te kinte hobe and maximum cost value t sell korer lagbe tahole amader profit hobe <br> min buy -  max sell = profit .
index r last theke start korbo bye korer jonne j amader maximum profit koto 
arr: [7,1,5,3,6,4] <br> 
index:5  arr=4    maxright=4                   maxprofit= 0                                                <br>
index:4  arr=6    maxright=6  (4<6)            maxprofit= 0,       (6-4=2)so,(0,2)     update maxprofit= 2 <br>
index:3  arr=3    maxright=6  (6>3)            maxprofit= 2,       (6-3=3)so,(2,3)     update maxprofit= 3 <br>
index:2  arr=5    maxright=6  (6>5)            maxprofit= 3,       (6-5=1)so,(3,1)     update maxprofit= 3 not update here  <br>
index:1  arr=1    maxright=6  (6>1)            maxprofit= 3,       (6-1=5)so,(3,5)     update maxprofit= 5 <br>
index:0  arr=7    maxright=7  (6<7)            maxprofit= 5,       (7-7=0)so,(5,0)     update maxprofit= 5 <br>

maxprofit=maxright-arr

![image](https://user-images.githubusercontent.com/C:\Users\User\OneDrive\Pictures\Camera Roll.png)
