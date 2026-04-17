class Solution:
    def calPoints(self, operations: List[str]) -> int:
        stack = []
        result = 0

        for op in operations:
            if op == "+":
                stack.append(stack[-1] + stack[-2])
            elif op == "C":
                stack.pop()
            elif op == "D":
                stack.append(2 * stack[-1])
            else:
                stack.append(int(op))

        print(stack)
        for value in stack:
            result += value

        return result