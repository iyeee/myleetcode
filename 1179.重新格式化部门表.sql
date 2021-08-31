--
-- @lc app=leetcode.cn id=1179 lang=mysql
--
-- [1179] 重新格式化部门表
--

-- @lc code=start
# Write your MySQL query statement below
select id,
    min(case month when 'Jan' then revenue end) as Jan_Revenue,
    min(case month when 'Feb' then revenue end) as Feb_Revenue,
    min(case month when 'Mar' then revenue end) as Mar_Revenue,
    min(case month when 'Apr' then revenue end) as Apr_Revenue,
    min(case month when 'May' then revenue end) as May_Revenue,
    min(case month when 'Jun' then revenue end) as Jun_Revenue,
    min(case month when 'Jul' then revenue end) as Jul_Revenue,
    min(case month when 'Aug' then revenue end) as Aug_Revenue,
    min(case month when 'Sep' then revenue end) as Sep_Revenue,
    min(case month when 'Oct' then revenue end) as Oct_Revenue,
    min(case month when 'Nov' then revenue end) as Nov_Revenue,
    min(case month when 'Dec' then revenue end) as Dec_Revenue
from Department
group by id
-- @lc code=end

-- 或者用case when
select id,
    min(case month when 'Jan' then revenue end) as Jan_Revenue,
    min(case month when 'Feb' then revenue end) as Feb_Revenue,
    min(case month when 'Mar' then revenue end) as Mar_Revenue,
    min(case month when 'Apr' then revenue end) as Apr_Revenue,
    min(case month when 'May' then revenue end) as May_Revenue,
    min(case month when 'Jun' then revenue end) as Jun_Revenue,
    min(case month when 'Jul' then revenue end) as Jul_Revenue,
    min(case month when 'Aug' then revenue end) as Aug_Revenue,
    min(case month when 'Sep' then revenue end) as Sep_Revenue,
    min(case month when 'Oct' then revenue end) as Oct_Revenue,
    min(case month when 'Nov' then revenue end) as Nov_Revenue,
    min(case month when 'Dec' then revenue end) as Dec_Revenue
from Department
group by id