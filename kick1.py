import math
t = int(input())


def isPalindrome(n):
      s = str(n)
      if(s==s[::-1]):
            return True
      else:
            return False


for i in range(t):
      A = int(input())
      j=1
      res = 0 
      while j<=math.sqrt(A):
            if(A%j==0):
                  if(A/j==j):
                        if(isPalindrome(A/j)):
                              res+=1
                  else:
                        if(isPalindrome(j)):
                              res+=1
            j+=1
      print('Case #'+str(i+1)+': '+str(res))



