--
-- @lc app=leetcode.cn id=175 lang=mysql
--
-- [175] 组合两个表
--

-- @lc code=start
# Write your MySQL query statement below
select firstName,lastName,city,state
from Person left join Address
on Person.personId=Address.personId
-- @lc code=end

-- 数据库在通过连接两张或多张表来返回记录时，都会生成一张中间的临时表，然后再将这张临时表返回给用户。
-- 在使用left jion时，on和where条件的区别如下：
-- 1、 on条件是在生成临时表时使用的条件，它不管on中的条件是否为真，都会返回左边表中的记录。
-- 2、where条件是在临时表生成好后，再对临时表进行过滤的条件。这时已经没有left join的含义（必须返回左边表的记录）了，条件不为真的就全部过滤掉。


-- Solution1:
-- select firstName,lastName,city,state
-- from Address right join Person
-- on Person.personId=Address.personId

-- select firstName,lastName,city,state
-- from Person left join Address
-- on Person.personId=Address.personId