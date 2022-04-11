T = int(input())
for i in range(T):
      n1 = list(map(int , input().split()))
      n2 = list(map(int , input().split()))
      n3 = list(map(int , input().split()))
    
      n4 = []
      check = 1000000
    
      for k in range(len(n1)):
            x = min(min(n1[k] , n2[k]),n3[k])
            n4.append(x)
    
      if(sum(n4)==check):
            lists = [str(x) for x in n4]
            s = " ".join(lists)
            print("Case #"+str(i+1)+":",s)
        
      elif(check > sum(n4)):
            print("Case #"+str(i+1)+":","IMPOSSIBLE")

      else:
            n5 = []
            left = sum(n4)-check 
            chootha = 0
            for l in range(4):
                  left = left-n4[l]
                  if(left>=0):
                        n5.append(0)
                  else:
                        n5.append(abs(left))
                        chootha = l+1
                        break
            for d in range(chootha , 4):
                  n5.append(n4[d])
            
            lists = [str(x) for x in n5]
            k = " ".join(lists)
            print("Case #"+str(i+1)+":",k)






