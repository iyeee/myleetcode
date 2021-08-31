--
-- @lc app=leetcode.cn id=626 lang=mysql
--
-- [626] 换座位
--

-- @lc code=start
# Write your MySQL query statement below
update seat  set student=(select student from seat where id=a.id+1);
-- @lc code=end

