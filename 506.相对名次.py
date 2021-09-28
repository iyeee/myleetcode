#
# @lc app=leetcode.cn id=506 lang=python3
#
# [506] 相对名次
#

# @lc code=start
class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        res=[]
        sortedScore=sorted(score,reverse=True)
        numMap={c:i for i,c in enumerate(sortedScore)}
        for n in score:
            index=numMap[n]
            if index==0:
                res.append("Gold Medal")
            elif index==1:
                res.append("Silver Medal")
            elif index==2:
                res.append("Bronze Medal")
            else:
                res.append(str(index+1))
        return res
# @lc code=end

# Solution1:
# class Solution:
#     def findRelativeRanks(self, score: List[int]) -> List[str]:
#         res=[]
#         sortedScore=sorted(score,reverse=True)
#         for n in score:
#             index=sortedScore.index(n)
#             if index==0:
#                 res.append("Gold Medal")
#             elif index==1:
#                 res.append("Silver Medal")
#             elif index==2:
#                 res.append("Bronze Medal")
#             else:
#                 res.append(str(index+1))
#         return res

# 用dic，更快
# class Solution:
#     def findRelativeRanks(self, score: List[int]) -> List[str]:
#         res=[]
#         sortedScore=sorted(score,reverse=True)
#         numMap={c:i for i,c in enumerate(sortedScore)}
#         for n in score:
#             index=numMap[n]
#             if index==0:
#                 res.append("Gold Medal")
#             elif index==1:
#                 res.append("Silver Medal")
#             elif index==2:
#                 res.append("Bronze Medal")
#             else:
#                 res.append(str(index+1))
#         return res

# 评论区
# class Solution:
#     def findRelativeRanks(self, score: List[int]) -> List[str]:
#         score_sort = sorted(score, reverse=True)
#         rank_list = ["Gold Medal", "Silver Medal",
#                      "Bronze Medal"]+[str(i+4) for i in range(len(score)-3)]
#         dic = dict(zip(score_sort, rank_list))
#         res = [dic.get(i) for i in score]
#         return res