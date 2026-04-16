class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        result = [0] * len(arr)
        maxValue = -1
        for i in range(len(arr)-1, -1,-1):
            result[i] = maxValue
            maxValue = max(maxValue, arr[i])
        return result
            