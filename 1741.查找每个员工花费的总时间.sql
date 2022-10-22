--
-- @lc app=leetcode.cn id=1741 lang=mysql
--
-- [1741] 查找每个员工花费的总时间
--

-- @lc code=start
# Write your MySQL query statement below
select event_day day,emp_id,sum(out_time-in_time) total_time
from Employees
group by emp_id,event_day 
-- @lc code=end

