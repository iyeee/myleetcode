--
-- @lc app=leetcode.cn id=176 lang=mysql
--
-- [176] 第二高的薪水
--

-- @lc code=start
# Write your MySQL query statement below
SELECT  MAX(salary) SecondHighestSalary
FROM Employee
WHERE salary < (
SELECT  MAX(salary)
FROM Employee)
-- @lc code=end

/* Solution1:
select 
ifnull((select distinct salary
from Employee
order by salary desc
limit 1,1),null)  SecondHighestSalary */

/* 
select 
ifnull((select distinct salary
from Employee
order by salary desc
limit 1,1),null)  SecondHighestSalary */


/* Solution2： */
/* 
SELECT  MAX(salary) SecondHighestSalary
FROM Employee
WHERE salary < (
SELECT  MAX(salary)
FROM Employee) */