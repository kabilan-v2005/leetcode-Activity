class Solution:
    def maxDepth(self, s: str) -> int:
        stack = []
        count = -1
        ans = 0
        for p in s:
            if p == "(":
                stack.append(p)

                count = len(stack)
            else:
                if stack and p == ")":
                    stack.pop()
                    # count = count + 1
                
            ans = max(count,ans)

        return ans

