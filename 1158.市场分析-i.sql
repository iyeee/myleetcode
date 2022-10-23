--
-- @lc app=leetcode.cn id=1158 lang=mysql
--
-- [1158] 市场分析 I
--

-- @lc code=start
# Write your MySQL query statement below
SELECT  user_id buyer_id,join_date,COUNT(order_id) orders_in_2019
FROM Users LEFT join Orders
on Users.user_id=Orders.buyer_id
and year(Orders.order_date)='2019'
group by user_id
-- @lc code=end

/* Solution 注意on和where区别 */
/* SELECT  user_id buyer_id,join_date,COUNT(order_id) orders_in_2019
FROM Users LEFT join Orders
on Users.user_id=Orders.buyer_id
and year(Orders.order_date)='2019'
group by user_id */
/* 外连接时要注意where和on的区别，on是在连接构造临时表时执行的，
不管on中条件是否成立都会返回主表（也就是left join左边的表）的内容，
where是在临时表形成后执行筛选作用的，不满足条件的整行都会被过滤掉。
如果这里用的是 where year(order_date)='2019' 那么得到的结果将会
把不满足条件的user_id为3，4的行给删掉。用on的话会保留user_id为3，4的行。
 */


/* Solution2 */
/* 
SELECT  user_id buyer_id,join_date,ifnull(UserBuy.cnt,0) orders_in_2019
FROM Users LEFT join (
    SELECT buyer_id,COUNT(order_id) cnt
    FROM Orders
    where order_date between '2019-01-01' and '2019-12-31'
    group by buyer_id
)UserBuy
on Users.user_id=UserBuy.buyer_id
group by user_id */