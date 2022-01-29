n = int(input())
original = n
sum = 0
while(n!=0):
      remainder = n%10
      sum = sum*10 + remainder
      n = n//10

if (sum==original):
      print("{} is a palindrome".format(original))
else:
      print("{} not a palindrome".format(original))
