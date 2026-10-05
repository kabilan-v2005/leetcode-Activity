# Write your MySQL query statement below
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee e
JOIN Department d
ON e.departmentId = d.id
WHERE 3 > (
    SELECT COUNT(DISTINCT e1.salary)
    FROM Employee e1
    WHERE e.departmentId  = e1.departmentId AND e1.salary > e.salary
)
-- order by e.salary desc
-- GROUP BY departmentId 