--
-- @lc app=leetcode.cn id=607 lang=mysql
--
-- [607] 销售员
--

-- @lc code=start
# Write your MySQL query statement below
SELECT NAME 
FROM
	SalesPerson s
	LEFT JOIN ( SELECT o.sales_id FROM company c INNER JOIN Orders o ON c.com_id = o.com_id AND c.NAME = 'RED' ) t 
ON s.sales_id = t.sales_id 
where t.sales_id IS NULL;
-- @lc code=end

/* Solution1:
select name
from SalesPerson
where  sales_id not in(
    select sales_id
    from orders,company
    where  orders.com_id=company.com_id
        and name='RED'
) */

/* Solution2: */
/* SELECT NAME 
FROM
	SalesPerson s
	LEFT JOIN ( SELECT o.sales_id FROM company c INNER JOIN Orders o ON c.com_id = o.com_id AND c.NAME = 'RED' ) t 
ON s.sales_id = t.sales_id 
where t.sales_id IS NULL; */
/* 
结论：

过滤条件放在 where后面：是先连接然生成临时查询结果，然后再筛选

过滤条件放在 on后面：先根据条件过滤筛选，再连，生成临时查询结果 */