#
# @lc app=leetcode.cn id=557 lang=python3
#
# [557] 反转字符串中的单词 III
#

# @lc code=start
class Solution:
    def reverseWords(self, s: str) -> str:
        l=s.split(" ")
        ll=[]
        for word in l:
            ll.append(word[::-1])
        return " ".join(ll)

# @lc code=end

