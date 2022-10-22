--
-- @lc app=leetcode.cn id=1141 lang=mysql
--
-- [1141] 查询近30天活跃用户数
--

-- @lc code=start
# Write your MySQL query statement below
select activity_date as day,count(distinct user_id) as active_users
from activity
where  activity_date>=' 2019-06-28'
    and activity_date<='2019-07-27'
group by activity_date
-- @lc code=end

/* Solution1:
select activity_date as day,count(distinct user_id) as active_users
from activity
group by activity_date
having activity_date>=' 2019-06-28'
    and activity_date<='2019-07-27' */

/* select activity_date as day,count(distinct user_id) as active_users
from activity
where  activity_date>=' 2019-06-28'
    and activity_date<='2019-07-27'
group by activity_date */