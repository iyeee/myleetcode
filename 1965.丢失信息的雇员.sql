--
-- @lc app=leetcode.cn id=1965 lang=mysql
--
-- [1965] 丢失信息的雇员
--

-- @lc code=start
# Write your MySQL query statement below
((SELECT
		e.employee_id
	FROM
		employees e
		LEFT JOIN salaries s ON e.employee_id = s.employee_id 
        where s.salary is null
)
UNION
(SELECT
		s.employee_id
	FROM
		employees e
		RIGHT JOIN salaries s ON e.employee_id = s.employee_id 
        where e.name is null
))
order by employee_id
-- @lc code=end

/* Solution1:
select t.employee_id
from(
(SELECT
		e.employee_id,
		e.NAME,
		s.salary 
	FROM
		employees e
		LEFT JOIN salaries s ON e.employee_id = s.employee_id 
        where s.salary is null
)
UNION
(SELECT
		s.employee_id,
		e.NAME,
		s.salary 
	FROM
		employees e
		RIGHT JOIN salaries s ON e.employee_id = s.employee_id 
        where e.name is null
))t
where 
    t.name is null
    or t.salary is null
order by t.employee_id */