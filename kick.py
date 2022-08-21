import math


t = int(input())
for i in range(t):
      values = list(map(int , input().split()))
      radius_calc = 0 
      R = values[0] 
      A = values[1] 
      B = values[2]
      sum = 0 
      left = True
      Right = False
      radius_calc = R
      while(radius_calc>0):
            sum+= math.pi*radius_calc*radius_calc
            if(left):
                  radius_calc = radius_calc*A 
                  left = False
                  Right = True
            elif(Right):
                  radius_calc = (radius_calc//B)
                  left = True
                  Right = False
      print('Case #'+str(i+1)+': '+str(round(sum , 6)))
