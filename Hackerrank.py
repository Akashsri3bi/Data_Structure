T = int(input())
for i in range(T):
      s = input()
      d = ""
      k = 0 
      if(s==s[::-1]):
            d = s
            print(f'Case #{i+1}',d)
      else:
            while(k<len(s)-1):
                  if(s[k]<=s[k+1]):
                        d = d + s[k] + s[k]
                  else:
                        d = d + s[k]
                  k = k+1
            print(f'Case #{i+1}',d+s[len(s)-1])






