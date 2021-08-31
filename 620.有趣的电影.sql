--
-- @lc app=leetcode.cn id=620 lang=mysql
--
-- [620] 有趣的电影
--

-- @lc code=start
# Write your MySQL query statement below
select id,movie,description,rating 
from cinema
where description<>'boring' 
and id&1
order by rating desc;
-- @lc code=end

1.<>,!= 一个意思 推荐<>
2.mysql可以用位运算
mod(id,2)=1--->id&1
3.也可以用%
mod(id,2)=1--->id%2=1