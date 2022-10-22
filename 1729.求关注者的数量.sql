--
-- @lc app=leetcode.cn id=1729 lang=mysql
--
-- [1729] 求关注者的数量
--

-- @lc code=start
# Write your MySQL query statement below
select f.user_id,count(distinct f.follower_id) followers_count
from Followers f
group by  user_id
-- @lc code=end
/* 
Solution1:
select f.user_id,count(f.follower_id) followers_count
from Followers f
group by  user_id
order by  user_id */


/* 使用distinct 关键字后会对distinct后面用到的关键字进行默认的升序排序 */

/* select f.user_id,count(f.follower_id) followers_count
from Followers f
group by  user_id
order by  user_id */