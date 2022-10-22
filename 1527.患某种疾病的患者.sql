--
-- @lc app=leetcode.cn id=1527 lang=mysql
--
-- [1527] 患某种疾病的患者
--

-- @lc code=start
# Write your MySQL query statement below
select *
from Patients
where left(conditions, 5) = "DIAB1" or locate(" DIAB1", conditions) != 0;
-- @lc code=end

/* Solution1: */
/* select   patient_id,patient_name,conditions
from Patients
where conditions like '% DIAB1%' or conditions like "DIAB1%"  */

/* Solution2: */
/* select   patient_id,patient_name,conditions
from Patients
where conditions  regexp '^DIAB1|\\sDIAB1' */
/* Solution3: */
/* select *
from Patients
where left(conditions, 5) = "DIAB1" or locate(" DIAB1", conditions) != 0; */