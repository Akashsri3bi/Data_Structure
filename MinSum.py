class Solution:
    def solve(self, arr, n):
        # code here
        arr.sort()
        s1 = "" ; 
        s2 = "" ; 
        for i in range(n):
            if i%2==0:
                s1+=str(arr[i])
            else:
                s2+=str(arr[i])
        if s1=="":
            s1="0"
        if s2=="":
            s2="0"
        return int(s1) + int(s2)