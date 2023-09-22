class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l, r = 0, 0
        while r < len(nums):
            if nums[r] != 0:
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
            r += 1
a = [1,2,3,4,0,0,0,6]

s = Solution()
s.moveZeroes(a)
print(a)       