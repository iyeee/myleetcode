--
-- @lc app=leetcode.cn id=1084 lang=mysql
--
-- [1084] 销售分析III
--

-- @lc code=start
# Write your MySQL query statement below
select p.product_id,p.product_name
from Product p JOIN Sales s 
on p.product_id=s.product_id
group by s.product_id
having min(sale_date)>='2019-01-01' and max(sale_date)<='2019-03-31'
-- @lc code=end
/* 
Solution1:
select product_id,product_name
from Product
where product_id in (
    select product_id
    from Sales
    group by product_id
    having max(sale_date)<='2019-03-31'
    and min(sale_date)>='2019-01-01'
) */

/* Solution2:
select p.product_id,p.product_name
from Product p , Sales s 
where p.product_id=s.product_id
group by s.product_id
having min(sale_date)>='2019-01-01' and max(sale_date)<='2019-03-31' */

/* select p.product_id,p.product_name
from Product p , Sales s 
where p.product_id=s.product_id
group by s.product_id
having min(sale_date)>='2019-01-01' and max(sale_date)<='2019-03-31' */