--
-- @lc app=leetcode.cn id=1667 lang=mysql
--
-- [1667] 修复表中的名字
--

-- @lc code=start
# Write your MySQL query statement below
select user_id,concat(upper(left(name,1)),lower(substring(name,2))) name 
from Users
order by user_id
-- @lc code=end
/* 
Solution1:
select user_id,concat(upper(left(name,1)),lower(right(name,LENGTH(name)-1))) name 
from Users
order by user_id */

/* 
Soluition2:
select user_id,concat(upper(left(name,1)),lower(substring(name,2))) name 
from Users
order by user_id */