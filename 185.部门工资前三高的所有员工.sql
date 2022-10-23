--
-- @lc app=leetcode.cn id=185 lang=mysql
--
-- [185] 部门工资前三高的所有员工
--

-- @lc code=start
# Write your MySQL query statement below
SELECT  b.name Department
       ,a.name Employee
       ,a.salary
FROM
(
	SELECT  dense_rank() over(partition by DepartmentId ORDER BY salary desc) AS ranking
	       ,DepartmentId
	       ,name
	       ,salary
	FROM Employee
) AS a
JOIN Department b
ON a.DepartmentId = b.id
WHERE a.ranking <= 3 
-- @lc code=end


/* Solution1 */
/* SELECT  d.name Department
       ,e1.name Employee
       ,e1.salary
FROM Employee e1
JOIN Department d
ON e1.DepartmentId = d.id where 3 > (
SELECT  COUNT(DISTINCT e2.salary)
FROM Employee e2
WHERE e2.salary > e1.salary
AND e1.DepartmentId = e2.DepartmentId ) */


/* Solution2:
SELECT  d.name Department
       ,e1.name Employee
       ,e1.salary
FROM Employee e1
JOIN Department d
ON e1.DepartmentId = d.id where 3 > (
SELECT  COUNT(DISTINCT e2.salary)
FROM Employee e2
WHERE e2.salary > e1.salary
AND e1.DepartmentId = e2.DepartmentId ) */