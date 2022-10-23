--
-- @lc app=leetcode.cn id=1393 lang=mysql
--
-- [1393] 股票的资本损益
--

-- @lc code=start
# Write your MySQL query statement below
SELECT stock_name,sum(case when operation='buy' then -price else price end) capital_gain_loss
FROM Stocks
group by stock_name
-- @lc code=end

/* Solution1:
SELECT stock_name,sum(if(operation='Sell',price,-price)) capital_gain_loss
FROM Stocks
group by stock_name */

/* SELECT stock_name,sum(if(operation='Sell',price,-price)) capital_gain_loss
FROM Stocks
group by stock_name */