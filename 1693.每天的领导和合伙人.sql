--
-- @lc app=leetcode.cn id=1693 lang=mysql
--
-- [1693] 每天的领导和合伙人
--

-- @lc code=start
# Write your MySQL query statement below
select date_id,make_name,count(distinct lead_id )  unique_leads,count(distinct partner_id)  unique_partners 
from DailySales
group by date_id,make_name 
-- @lc code=end

