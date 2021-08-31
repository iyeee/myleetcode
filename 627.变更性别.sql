--
-- @lc app=leetcode.cn id=627 lang=mysql
--
-- [627] 变更性别
--

-- @lc code=start
# Write your MySQL query statement below

-- @lc code=end



-- 方法一: sql case when语法

-- update salary 
-- set 
--     sex=case sex
--     when 'm' then 'f'
--     when 'f' then 'm'
--     end;

-- 方法二: f和m ascii码 相加减去当前性别实现反转