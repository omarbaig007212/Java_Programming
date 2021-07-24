#Identification
1.Given an array of any type
2.Asked for subarray or substring.(continuous)
3.Window size given (Fixed) or not given/asked (Variable)
![image](https://user-images.githubusercontent.com/58821151/126865342-70e1fdb9-db45-4ec8-a99a-ded08f5e759a.png)
1.st Question![image](https://user-images.githubusercontent.com/58821151/126877718-4ac0a259-504b-4b98-9f3f-bfa501f0eebd.png)
if(j-i+1<k){j++} once j-i+1==k { maintain the j-i+1==k here by adding the kth element then comparing the sum,then after that removing the ith index ele from the sum to maintain the cycle }
