--
-- @lc app=leetcode.cn id=184 lang=mysql
--
-- [184] 部门工资最高的员工
--

-- @lc code=start
# Write your MySQL query statement below
SELECT  d.name Department
       ,e.name Employee
       ,e.Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id 
and (e.departmentId, e.salary) in(
SELECT  e2.departmentId
       ,MAX(salary)
FROM Employee e2
GROUP BY  e2.departmentId)
-- @lc code=end
/* 
Solution1:
SELECT  d.name Department
       ,e.name Employee
       ,e.Salary
FROM Employee e, Department d
WHERE e.departmentId = d.id
AND salary = (
SELECT  MAX(salary) salary
FROM Employee e2
WHERE e2.departmentId = e.departmentId) */

/* SELECT  d.name Department
       ,e.name Employee
       ,e.Salary
FROM Employee e join Department d
on e.departmentId = d.id
AND salary = (
SELECT  MAX(salary) salary
FROM Employee e2
WHERE e2.departmentId = e.departmentId) */


/* Solution2: ALL */
/* SELECT  d.name Department
       ,e.name Employee
       ,e.Salary
FROM Employee e join Department d
on e.departmentId = d.id
AND salary = (
SELECT  MAX(salary) salary
FROM Employee e2
WHERE e2.departmentId = e.departmentId) */

/* 
Solution3:  双in
SELECT  d.name Department
       ,e.name Employee
       ,e.Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id 
and (e.departmentId, e.salary) in(
SELECT  e2.departmentId
       ,MAX(salary)
FROM Employee e2
GROUP BY  e2.departmentId) */