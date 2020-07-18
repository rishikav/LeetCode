// 132 pattern

// Given a sequence of n integers a1, a2, ..., an, a 132 pattern is a subsequence ai, aj, ak such that i < j < k and ai < ak < aj. Design an algorithm that takes a list of n numbers as input and checks whether there is a 132 pattern in the list.

class Solution:
    def check(self, arr: List[int], val) -> int:
        while len(arr) >= 2:
            init = 0
            j = arr[init]
            for k in arr[1:]:
                if k<j and val<j and val<k:
                    return j
            arr = arr[init+1:]
        return -inf
        
    def find132pattern(self, nums: List[int]) -> bool:
        while len(nums) >= 3:
            i = nums[0]
            j = self.check(nums[1:], i)
            
            
            if i<j :
                return True
            else :
                return self.find132pattern(nums[1:])
        
        return False