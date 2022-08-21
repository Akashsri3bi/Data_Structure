a = "1010"
b = "1011"
first = 0 
second = 0
for i in range(len(a)-1 , -1  , -1):
      index = 0 
      value = int(a[index])
      first = first + (2**i)*value
      
      index+=1
            
for i in range(len(b)-1 , -1 ,-1):
      index = 0 
      value = int(b[index])
      second = second + (2**i)*value
      
      index+=1
            
third = first+second
result = str(bin(third))
print(result[2:])

