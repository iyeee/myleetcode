--
-- @lc app=leetcode.cn id=626 lang=mysql
--
-- [626] 换座位
--

-- @lc code=start
# Write your MySQL query statement below
SELECT
    (CASE
        WHEN id%2 = 0 THEN id - 1
        WHEN id%2 != 0 AND counts = id THEN id
        ELSE id + 1
    END) AS id,
    student
FROM
    seat,
    (SELECT
        COUNT(*) AS counts
    FROM
        seat) AS seat_counts
ORDER BY id;

-- @lc code=end


/* Solution1: 位运算
SELECT s1.id,coalesce(s2.student,s1.student) student
FROM Seat s1 LEFT join Seat s2
ON (s1.id+1)^1-1 = s2.id
ORDER by id  */

/* 
Solution2:
SELECT  if(id%2 = 0,id-1,if(id = (
SELECT  COUNT(distinct id)
FROM Seat), id, id+1)) id, student
FROM Seat
ORDER BY id */


/* Solution3: */
/* SELECT
    (CASE
        WHEN id%2 != 0 AND counts != id THEN id + 1
        WHEN id%2 != 0 AND counts = id THEN id
        ELSE id - 1
    END) AS id,
    student
FROM
    seat,
    (SELECT
        COUNT(*) AS counts
    FROM
        seat) AS seat_counts
ORDER BY id; */

/* SELECT
    (CASE
        WHEN id%2 = 0 THEN id - 1
        WHEN id%2 != 0 AND counts = id THEN id
        ELSE id + 1
    END) AS id,
    student
FROM
    seat,
    (SELECT
        COUNT(*) AS counts
    FROM
        seat) AS seat_counts
ORDER BY id; */
