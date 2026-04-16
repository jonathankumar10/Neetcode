class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        result = [0] * len(arr)
        for i in range(len(arr)):
            maxValue = -1
            for j in range(i+1, len(arr)):
                maxValue = max(maxValue, arr[j])
            result[i] = maxValue
        return result
            