--
-- @lc app=leetcode.cn id=1890 lang=mysql
--
-- [1890] 2020年最后一次登录
--

-- @lc code=start
# Write your MySQL query statement below
SELECT user_id, max(time_stamp) AS last_stamp FROM Logins
WHERE time_stamp regexp '^2020'
GROUP BY user_id
-- @lc code=end


/* Solution1
select user_id,max(time_stamp) last_stamp
from Logins
where  time_stamp>='2020-01-01' and time_stamp<'2021-01-01'
group by user_id */

/* select user_id,max(time_stamp) last_stamp
from Logins
where  time_stamp>='2020-01-01' and time_stamp<'2021-01-01'
group by user_id  */

/* SELECT user_id, max(time_stamp) AS last_stamp FROM Logins
WHERE time_stamp RLIKE '^2020'
GROUP BY user_id */

/* 
SELECT user_id, max(time_stamp) AS last_stamp FROM Logins
WHERE time_stamp regexp '^2020'
GROUP BY user_id */