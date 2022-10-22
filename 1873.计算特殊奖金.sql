--
-- @lc app=leetcode.cn id=1873 lang=mysql
--
-- [1873] 计算特殊奖金
--

-- @lc code=start
# Write your MySQL query statement below
select  employee_id, 
    case
        when employee_id%2=1 and name not like 'M%' then salary
        else 0
    end bonus
from Employees
order by employee_id
-- @lc code=end

/* Solution1： */
/* 
select  employee_id, if(employee_id%2=1 and left(name,1)!='M',salary,0) bonus
from Employees
order by employee_id */

/* select  employee_id, 
    case
        when employee_id%2=1 and left(name,1)!='M' then salary
        else 0
    end bonus
from Employees
order by employee_id */

/* select  employee_id, 
    case
        when employee_id%2=1 and left(name,1)!='M' then salary
        else 0
    end bonus
from Employees
order by employee_id */