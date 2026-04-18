class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        first = -1
        second = 1
        while first == -1 or nums[first] + nums[second] != target or first == second:
            first += 1 
            for num in nums:
                if nums[first] + num == target and first != nums.index(num):
                    second = nums.index(num)

        return [first, second]
