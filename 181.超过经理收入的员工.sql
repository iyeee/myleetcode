--
-- @lc app=leetcode.cn id=181 lang=mysql
--
-- [181] 超过经理收入的员工
--

-- @lc code=start
# Write your MySQL query statement below
select a.Name as Employee
from Employee as a,Employee as b
where a.Salary > b.Salary 
and a.ManagerId=b.Id;

-- @lc code=end

-- 也可以用join
-- SELECT
--      a.NAME AS Employee
-- FROM Employee AS a JOIN Employee AS b
--      ON a.ManagerId = b.Id
--      AND a.Salary > b.Salary;