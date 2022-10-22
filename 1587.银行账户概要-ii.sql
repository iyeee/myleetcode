--
-- @lc app=leetcode.cn id=1587 lang=mysql
--
-- [1587] 银行账户概要 II
--

-- @lc code=start
# Write your MySQL query statement below
select u.name,sum(t.amount) balance
from Users u , Transactions t
where u.account=t.account
group by t.account
having balance>10000
-- @lc code=end

/* Solution1:
select u.name,sum(t.amount) balance
from Users u join Transactions t
on u.account=t.account
group by t.account
having balance>10000 */

/* select u.name,sum(t.amount) balance
from Users u , Transactions t
where u.account=t.account
group by t.account
having balance>10000 */