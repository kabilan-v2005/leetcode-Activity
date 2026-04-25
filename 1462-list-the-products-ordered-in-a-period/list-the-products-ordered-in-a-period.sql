# Write your MySQL query statement below
SELECT p.product_name ,SUM(o.unit) AS unit
FROM Products p
JOIN Orders o
ON o.product_id=p.product_id
WHERE o.order_date >= '2020-02-01'
    AND o.order_date < '2020-03-01'
GROUP BY 1
HAVING SUM(o.unit) >= 100