--
-- @lc app=leetcode.cn id=197 lang=mysql
--
-- [197] 上升的温度
--

-- @lc code=start
# Write your MySQL query statement below
select a.id
from Weather a join Weather b
on datediff(a.recordDate,b.recordDate)=1
and a.Temperature>b.Temperature
-- @lc code=end
/* 
Solution1:
select a.id
from Weather as a,Weather as b
where datediff(a.recordDate,b.recordDate)=1
and a.Temperature>b.Temperature

select a.id
from Weather as a,Weather as b
where datediff(a.recordDate,b.recordDate)=1
and a.Temperature>b.Temperature */
/* 
select a.id
from Weather a join Weather b
on datediff(a.recordDate,b.recordDate)=1
and a.Temperature>b.Temperature */