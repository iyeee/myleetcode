--
-- @lc app=leetcode.cn id=586 lang=mysql
--
-- [586] 订单最多的客户
--

-- @lc code=start
# Write your MySQL query statement below


select customer_number
from Orders 
group by customer_number
order by count(customer_number) desc
limit 0,1
-- @lc code=end

/* Solution1:
select customer_number
from Orders group by customer_number
having count(order_number)=(
select max(num) as customer_number from 
(select customer_number,count(order_number) as num
from Orders
group by customer_number)tmp) */

/* 
Solution2:
select customer_number
from Orders 
group by customer_number
order by count(customer_number) desc
limit 0,1 */