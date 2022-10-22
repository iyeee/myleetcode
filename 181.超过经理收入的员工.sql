--
-- @lc app=leetcode.cn id=181 lang=mysql
--
-- [181] 超过经理收入的员工
--

-- @lc code=start
# Write your MySQL query statement below
select a.name as Employee from
Employee as a join Employee as b
on a.ManagerId=b.id and a.Salary>b.Salary
-- @lc code=end

-- 也可以用join
-- SELECT
--      a.NAME AS Employee
-- FROM Employee AS a JOIN Employee AS b
--      ON a.ManagerId = b.Id
--      AND a.Salary > b.Salary;


Solution1:
select a.name as Employee from
Employee as a,Employee as b
where a.ManagerId=b.id and a.Salary>b.Salary

select a.name as Employee from
Employee as a,Employee as b
where a.ManagerId=b.id and a.Salary>b.Salary