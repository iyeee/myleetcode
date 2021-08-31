--
-- @lc app=leetcode.cn id=595 lang=mysql
--
-- [595] 大的国家
--

-- @lc code=start
# Write your MySQL query statement below
select name,population,area 
from World 
where area>3000000
UNION
select name,population,area
from World 
where population>25000000;
-- @lc code=end


-- 方法一：使用or
-- select name,population,area from World where area>3000000 or population>25000000;


-- 方法二：使用 WHERE 子句和 UNION连接子查询
-- or也许会使索引失效，也许UNION效率更高

-- select name,population,area 
-- from World 
-- where area>3000000
-- UNION
-- select name,population,area
-- from World 
-- where population>25000000;