--
-- @lc app=leetcode.cn id=183 lang=mysql
--
-- [183] 从不订购的客户
--

-- @lc code=start
# Write your MySQL query statement below
select name as Customers
from Customers 
where id
not in(select CustomerId from Orders)
-- @lc code=end

-- 方法一：not in+子查询
-- not in 效率较低

-- select Name as Customers
-- from Customers
-- where id
-- not in (select CustomerId from Orders);


-- 方法二: 左连接后值为null
-- 特别注意：最后一句Id is null 而不是id=null

-- select Name as Customers
-- from Customers
-- left join Orders
-- on Customers.Id=Orders.CustomerId
-- where Orders.Id is null;
/* 
select name as Customers
from Customers left join Orders
on Customers.id=Orders.CustomerId
where CustomerId is null */