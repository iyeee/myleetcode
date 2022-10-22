--
-- @lc app=leetcode.cn id=182 lang=mysql
--
-- [182] 查找重复的电子邮箱
--

-- @lc code=start
# Write your MySQL query statement below
select Email from
(select Email,count(Email) as num
from Person
group by Email) as statistic
where num>1
-- @lc code=end

-- 方法一：使用 GROUP BY 和 HAVING 条件
-- 向 GROUP BY 添加条件的一种更常用的方法是使用 HAVING 子句，该子句更为简单高效。
-- select Email from Person group by Email having count(Email)>1; 

-- 方法二：使用 GROUP BY 和临时表
-- select Email from
-- (
--   select Email, count(Email) as num
--   from Person
--   group by Email
-- ) as statistic
-- where num > 1;

-- 方法三：使用自连接
-- select distinct a.Email from 
-- Person as a,Person as b
-- where a.id!=b.id
-- and a.Email=b.Email;