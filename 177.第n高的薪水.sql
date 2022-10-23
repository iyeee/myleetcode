--
-- @lc app=leetcode.cn id=177 lang=mysql
--
-- [177] 第N高的薪水
--

-- @lc code=start
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  set n:=n-1;
  RETURN (
      # Write your MySQL query statement below.
          
  );
END
-- @lc code=end

/* Solution1:
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  set n:=n-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT  salary
        FROM Employee
        group by salary
        ORDER BY salary desc
        LIMIT n , 1
  );
END */

/* CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  set n:=n-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT distinct salary
        FROM Employee
        ORDER BY salary desc
        LIMIT n , 1
  );
END */