#
# @lc app=leetcode.cn id=3 lang=python3
#
# [3] 无重复字符的最长子串
#

# @lc code=start
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        word_set=set()
        res,tmp,left=0,0,0
        for i,c in enumerate(s):
            tmp+=1
            while s[i] in word_set:
                word_set.remove(s[left])
                left+=1
                tmp-=1
            res=max(res,tmp)
            word_set.add(c)
        return res
# print(Solution().lengthOfLongestSubstring("abccdabcbb"))
# @lc code=end

# Solution1:
# 较慢
# class Solution:
#     def lengthOfLongestSubstring(self, s: str) -> int:
#         word_map={}
#         tmp,res=0,0
#         for i,c in enumerate(s):
#             if c not in word_map:
#                 word_map.update({c:i})
#                 tmp+=1
#             else:
#                 res=max(res,tmp)
#                 pre=word_map[c]
#                 tmp=i-pre
#                 word_map.clear()
#                 word_map={s[j]:j for j in range(pre+1,i+1)}
#         res=max(res,tmp)
#         return res

# Solution2:
# 滑动窗户
# class Solution:
#     def lengthOfLongestSubstring(self, s: str) -> int:
#         word_set=set()
#         right,ans,lenth=0,0,len(s)
#         for i in range(lenth):
#             if i!=0:
#                 word_set.remove(s[i-1])
#             while right<lenth and s[right] not in word_set:
#                 word_set.add(s[right])
#                 right+=1
#             ans=max(ans,right-i)
#         return ans

# class Solution:
#     def lengthOfLongestSubstring(self, s: str) -> int:
#         word_set=set()
#         res,tmp,left=0,0,0
#         for i,c in enumerate(s):
#             tmp+=1
#             while s[i] in word_set:
#                 word_set.remove(s[left])
#                 left+=1
#                 tmp-=1
#             res=max(res,tmp)
#             word_set.add(c)
#         return res