--
-- @lc app=leetcode.cn id=608 lang=mysql
--
-- [608] 树节点
--

-- @lc code=start
# Write your MySQL query statement below
# 根节点
SELECT A.id, 'Root' AS 'Type'
FROM tree AS A
WHERE A.p_id IS NULL

UNION

# 叶子节点
# 核心思想就是看：A中的id有没有当过父亲
# 为了覆盖只有一个节点的情况，加了 p_id IS NOT NULL
SELECT A.id, 'Leaf' AS 'Type'
FROM tree AS A LEFT JOIN tree AS B
  ON A.id = B.p_id
WHERE B.p_id IS NULL AND A.p_id IS NOT NULL

UNION

# 内部节点
SELECT A.id, 'Inner' AS 'Type'
FROM tree AS A LEFT JOIN tree AS B
  ON A.id = B.p_id
WHERE B.p_id IS NOT NULL AND A.p_id IS NOT NULL

ORDER BY id;
-- @lc code=end


/* Solution1：
(   
SELECT  id
        ,'Root' AS Type
FROM tree
WHERE p_id is null )
UNION (
SELECT  id
        ,'Leaf' AS Type
FROM tree t1
WHERE t1.id not IN ( SELECT p_id FROM tree WHERE p_id is not null)
AND t1.p_id is not null )
UNION (
SELECT  id
        ,'Inner' AS Type
FROM tree
WHERE id in(
SELECT  p_id
FROM tree
WHERE p_id is not null) AND p_id is not null )
ORDER BY id  */

/* 
# 根节点
SELECT A.id, 'Root' AS 'Type'
FROM tree AS A
WHERE A.p_id IS NULL

UNION

# 叶子节点
# 核心思想就是看：A中的id有没有当过父亲
# 为了覆盖只有一个节点的情况，加了 p_id IS NOT NULL
SELECT A.id, 'Leaf' AS 'Type'
FROM tree AS A LEFT JOIN tree AS B
  ON A.id = B.p_id
WHERE B.p_id IS NULL AND A.p_id IS NOT NULL

UNION

# 内部节点
SELECT A.id, 'Inner' AS 'Type'
FROM tree AS A LEFT JOIN tree AS B
  ON A.id = B.p_id
WHERE B.p_id IS NOT NULL AND A.p_id IS NOT NULL

ORDER BY id; */

/* Solution2: */
/* SELECT
id AS `Id`,
CASE
    WHEN tree.id = (SELECT atree.id FROM tree atree WHERE atree.p_id IS NULL)
        THEN 'Root'
    WHEN tree.id IN (SELECT atree.p_id FROM tree atree)
        THEN 'Inner'
    ELSE 'Leaf'
END AS Type
FROM
tree
ORDER BY `Id` */

/* Solution3: */
/* SELECT
    atree.id,
    IF(ISNULL(atree.p_id),
        'Root',
        IF(atree.id IN (SELECT p_id FROM tree), 'Inner','Leaf')) Type
FROM
    tree atree
ORDER BY atree.id */