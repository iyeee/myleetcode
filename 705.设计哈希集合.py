#
# @lc app=leetcode.cn id=705 lang=python3
#
# [705] 设计哈希集合
#

# @lc code=start
class MyHashSet:

    def __init__(self):
        self.buckets=1009
        self.table=[[] for _ in range(self.buckets)]
    
    def hash(self,key):
        return key%self.buckets

    def add(self, key: int) -> None:
        if key not in self.table[self.hash(key)]:
            self.table[self.hash(key)].append(key)


    def remove(self, key: int) -> None:
        hashKey=self.hash(key)
        if key not in self.table[hashKey]:
            return
        self.table[hashKey].remove(key)

    def contains(self, key: int) -> bool:
        if key in self.table[self.hash(key)]:
            return True
        return False

# Your MyHashSet object will be instantiated and called as such:
# obj = MyHashSet()
# obj.add(key)
# obj.remove(key)
# param_3 = obj.contains(key)
# @lc code=end

# Solution1:
# class MyHashSet:
# 较慢
#     def __init__(self):
#         self.nums=[]
#     def add(self, key: int) -> None:
#         if key not in self.nums:
#             self.nums.append(key)


#     def remove(self, key: int) -> None:
#         if key in self.nums:
#             self.nums.remove(key)

#     def contains(self, key: int) -> bool:
#         return key in self.nums

# Solution2:
# class MyHashSet:
# 大数组，空间换时间
#     def __init__(self):
#         self.nums=[]
#     def add(self, key: int) -> None:
#         if key not in self.nums:
#             self.nums.append(key)


#     def remove(self, key: int) -> None:
#         if key in self.nums:
#             self.nums.remove(key)

#     def contains(self, key: int) -> bool:
#         return key in self.nums

# solution3：
# 不定长拉链数组
# class MyHashSet:

#     def __init__(self):
#         self.buckets=1009
#         self.table=[[] for _ in range(self.buckets)]
    
#     def hash(self,key):
#         return key%self.buckets

#     def add(self, key: int) -> None:
#         if key not in self.table[self.hash(key)]:
#             self.table[self.hash(key)].append(key)


#     def remove(self, key: int) -> None:
#         hashKey=self.hash(key)
#         if key not in self.table[hashKey]:
#             return
#         self.table[hashKey].remove(key)

#     def contains(self, key: int) -> bool:
#         if key in self.table[self.hash(key)]:
#             return True
#         return False
