class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        return self.helper(nums)
    
    def helper(self,nums):
        for i in range(0,len(nums)):
            if nums[i] > 9:
                if self.sum_digit(nums[i]) == i:
                    return i

            else:
                if nums[i] == i:
                    return i
        return -1

    def sum_digit(self,n):
        s = 0
        while n > 0:
            d = n % 10
            s += d
            n //= 10
        return s

        