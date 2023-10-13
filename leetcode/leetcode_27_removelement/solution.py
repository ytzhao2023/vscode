class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        index = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[index] = nums[i]
                index += 1
        return index        
        


s = Solution()
nums_test = [0, 1, 2, 2, 4, 5]
val_test = 2
s.removeElement(nums_test, val_test)
print(nums_test)
