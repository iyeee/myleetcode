--
-- @lc app=leetcode.cn id=1581 lang=mysql
--
-- [1581] 进店却未进行过交易的顾客
--

-- @lc code=start
# Write your MySQL query statement below
select  v.customer_id,count(v.customer_id) as count_no_trans
from Visits v
left join Transactions t on v.visit_id=t.visit_id
where t.amount is null
group by customer_id;

-- @lc code=end
/* 

Solution1:
select  v.customer_id,count(v.customer_id) as count_no_trans
from Visits v
where v.visit_id not in(
    select distinct t.visit_id
    from Transactions t
)
group by customer_id
order by count_no_trans desc */

/* Solution2:
select  v.customer_id,count(v.customer_id) as count_no_trans
from Visits v
left join Transactions t on v.visit_id=t.visit_id
where t.amount is null
group by customer_id; */