class Solution:
    def sortBySetBitCount(self, arr, n):
        func = lambda e : bin(e).count('1')
        arr.sort(reverse = True , key = func) #Since asked in descending order
        return arr 
