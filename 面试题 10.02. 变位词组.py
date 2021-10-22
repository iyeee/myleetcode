#
# @lc app=leetcode.cn id=49 lang=python3
#
# [49] 字母异位词分组
#

# @lc code=start
import collections
class Solution:
    def groupAnagrams(self, strs) :
        mp = collections.defaultdict(list)
        print(mp)
        for st in strs:
            counts = [0] * 26
            for ch in st:
                counts[ord(ch) - ord("a")] += 1
            # 需要将 list 转换成 tuple 才能进行哈希
            mp[tuple(counts)].append(st)
        print(mp)
        return list(mp.values())
Solution().groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
# @lc code=end

# Solution1:
# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         m={i:str for i,str in enumerate(strs)}
#         for k,v in m.items():
#             m[k]="".join(sorted(v))
#         m=dict(sorted(m.items(),key=lambda x:x[1]))
#         res,tmp=[],[]
#         pre="#"
#         m.update({-1:"#"})
#         for k,v in m.items():
#             if v==pre:
#                 tmp.append(strs[k])
#             else:
#                 res.append(tmp)
#                 tmp=[strs[k]]
#             pre=v
#         return res[1:]



# Solution2:
# 官解
# import collections
# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         mp=collections.defaultdict(list)
#         for str in strs:
#             key="".join(sorted(str))
#             mp[key].append(str)
#         return list(mp.values())

# Solution3：
# 官解
# 字数计数作为key
# import collections
# class Solution:
#     def groupAnagrams(self, strs) :
#         mp = collections.defaultdict(list)
#         for st in strs:
#             counts = [0] * 26
#             for ch in st:
#                 counts[ord(ch) - ord("a")] += 1
#             # 需要将 list 转换成 tuple 才能进行哈希
#             mp[tuple(counts)].append(st)
#         return list(mp.values())