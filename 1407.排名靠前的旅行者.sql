--
-- @lc app=leetcode.cn id=1407 lang=mysql
--
-- [1407] 排名靠前的旅行者
--

-- @lc code=start
# Write your MySQL query statement below
select u.name, ifnull(travelled_distance,0) as travelled_distance
from Users as u left join(
    select r.user_id,sum(distance) as travelled_distance
    from Rides as r
    group by user_id
)t on u.id=t.user_id
order by travelled_distance desc,name asc
-- @lc code=end

Solution1:
/* select u.name, ifnull(travelled_distance,0) as travelled_distance
from Users as u left join(
    select r.user_id,sum(distance) as travelled_distance
    from Rides as r
    group by user_id
)t on u.id=t.user_id
order by travelled_distance desc,name asc */