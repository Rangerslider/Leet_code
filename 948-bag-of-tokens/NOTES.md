​dorlam 1 ta array dea ase [100,200,300,400] <br>er modde power dea ase 1 ta limited or fixed value .and amader score ase 0 te .to amra jokon score udate korte jabo tokon amader power use kore array r index e count korer lagbe .index r value check korer lagbe power r theke boro naki choto jodi choto hoi tokon power (taka dorlam) die amra index count korlam ejonno paower kome gelo but amader score update holo .r por chech korbo je amader index r next value power theke boro naki choto jodi choto hoi tokon amra score jeta update hoise 1 oita die maximum power kinbo index r value theke so tokon score aber 0 hoie jabe and aber ager process e  kaj agabe .
example :<br>
[100,200,300,400],     power=200,                                                                              score= 0 ,    ans = 0 <br>
let
i1= 100 ,               power = 200-100 --- 100 ,                                                              score =1 ,    ans = 1<br>
i2= 200 ,               power = 100 { update maximum power spent score} let j=400 so updatepower=400+100=500   score= 0 ,    ans = 0<br>
i2= 200 ,               power =500-200 ---300 ,                                                                score =1,     ans = 1<br>
i3= 300 ,               power =300-300 ---0  ,                                                                 score= 2 ,    ans = 2<br>
last inndex r count hobe na oita score die kine felsi <br>
array sorting ->   {min->left,max->right}  ->2pointer <br>
![306889167_966313270791366_5670679667965371480_n](https://user-images.githubusercontent.com/81003608/191064048-591e45fb-d19d-4f10-b4a9-36aaaa6b1a1d.jpg)
