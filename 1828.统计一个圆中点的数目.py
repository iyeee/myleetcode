#
# @lc app=leetcode.cn id=1828 lang=python3
#
# [1828] 统计一个圆中点的数目
#

# @lc code=start
class Solution:
    def countPoints(self, points, queries):
        def helper(x,y,query):
            distance=(x-query[0])**2+(y-query[1])**2
            sqr=query[2]**2
            if distance>sqr:
                return False
            else:
                return True
        res=[0]*len(queries)
        for point in points:
            for i,query in enumerate(queries):
                if helper(point[0],point[1],query):
                    res[i]+=1
        return res
# @lc code=end

