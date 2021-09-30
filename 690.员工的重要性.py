#
# @lc app=leetcode.cn id=690 lang=python3
#
# [690] 员工的重要性
#

# @lc code=start
"""
# Definition for Employee.
class Employee:
    def __init__(self, id: int, importance: int, subordinates: List[int]):
        self.id = id
        self.importance = importance
        self.subordinates = subordinates
"""
from queue import Queue
from typing import TextIO
class Solution:
    def getImportance(self, employees: List['Employee'], id: int) -> int:
        m={employee.id:employee for employee in employees}
        def dfs(n):
            employee=m[n]
            return employee.importance+sum(dfs(n) for n in employee.subordinates)
        return dfs(id)
# @lc code=end


# Solution1:
# 利用队列广度优先遍历
# from queue import Queue
# class Solution:
#     def getImportance(self, employees: List['Employee'], id: int) -> int:
#         m={employee.id:employee for employee in employees}
#         q=Queue()
#         q.put(id)
#         sum=0
#         while not q.empty():
#             employee=m[q.get()]
#             sum+=employee.importance
#             for n in employee.subordinates:
#                 q.put(n)
#         return sum

# dfs 递归
# class Solution:
#     def getImportance(self, employees: List['Employee'], id: int) -> int:
#         m={employee.id:employee for employee in employees}
#         def dfs(n):
#             employee=m[n]
#             return employee.importance+sum(dfs(n) for n in employee.subordinates)
#         return dfs(id)