class Solution:
    def decode(self, encoded: list[int], first: int) -> list[int]:
        list = []
        list.append(first)
        for i in range(0,len(encoded)):
            list.append(encoded[i] ^ list[i])
        return list 