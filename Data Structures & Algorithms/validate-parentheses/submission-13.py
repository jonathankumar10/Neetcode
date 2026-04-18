class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapOfParenthesis = {')': '(', ']': '[', '}': '{'}

        for c in s:
            if(c == "{" or c == "[" or c == "("):
                stack.append(c)
            else:
                if(stack):
                    if stack[-1] != mapOfParenthesis[c]:
                        return False
                    else:
                        stack.pop();
                elif ((c == ']' or c == '}' or c == ')')):
                    return False
        if stack:
            return False
        else:
            return True
