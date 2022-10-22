--
-- @lc app=leetcode.cn id=596 lang=mysql
--
-- [596] 超过5名学生的课
--

-- @lc code=start
# Write your MySQL query statement below
select class
from Courses
group by class
having count(distinct student)>=5
-- @lc code=end

/* Solution1:
select class
from Courses
group by class
having count(class)>=5 */

/* select class
from Courses
group by class
having count(distinct student)>=5 */