--
-- @lc app=leetcode.cn id=627 lang=mysql
--
-- [627] 变更性别
--

-- @lc code=start
# Write your MySQL query statement below
update salary set sex=char(11^ascii(sex));
-- @lc code=end



-- 方法一: sql case when或if语法

-- update salary 
-- set 
--     sex=case sex
--     when 'm' then 'f'
--     when 'f' then 'm'
--     end;

-- update salary 
-- set 
--     sex=case sex
--     when 'm' then 'f'
--     else 'm'
--     end;

-- 方法二: f和m ascii码 相加减去当前性别实现反转
-- ascii(f)=102
-- ascii(m)=109
-- 102+109=211
-- update salary set sex=char(211-ascii(sex));


-- 方法三: f和m异或 在与当前性别值异或实现取反
-- ascii('f') 0b01100110
-- ascii('m') 0b01101101
-- ascii('f')+ascii('m')=0b00001011=11
-- update salary set sex=char(ascii('f')^ascii('m')^ascii(sex));
-- update salary set sex=char(11^ascii(sex));