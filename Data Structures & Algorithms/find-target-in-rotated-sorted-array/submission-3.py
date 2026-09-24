class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums)-1

        while(left<right):
            mid = left + (right-left)//2
            if(nums[mid]<nums[right]):
                right = mid
            else:
                left = mid + 1

        pivot = left

        if(nums[pivot] <= target <= nums[-1]):
            return self.binarySearch(nums, target, pivot, len(nums)-1)
        else:
            return self.binarySearch(nums, target, 0, pivot-1)

    def binarySearch(self, nums: List[int], target: int, left: int, right: int) -> int:
        while(left<=right):
            mid = left + (right - left)//2
            if(nums[mid]<target):
                left = mid + 1
            elif(nums[mid]>target):
                right = mid - 1
            elif(nums[mid]==target):
                return mid
        return -1
