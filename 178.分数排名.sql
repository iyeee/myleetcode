--
-- @lc app=leetcode.cn id=178 lang=mysql
--
-- [178] 分数排名
--

-- @lc code=start
# Write your MySQL query statement below
select score as Score,dense_rank() over (order by score desc) as 'rank'
from Scores 
-- @lc code=end

Solution1:
select a.score as Score,(select count(distinct b.score) from Scores as b where b.score>=a.score) as 'Rank'
from Scores as a
order by a.score desc


Solution2:
select score as Score,dense_rank() over (order by score desc) as 'rank'
from Scores 