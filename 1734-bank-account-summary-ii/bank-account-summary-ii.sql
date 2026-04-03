# Write your MySQL query statement below
SELECT u.name ,SUM(t.amount) AS balance
from Users u
join Transactions t
    ON u.account = t.account




GROUP BY u.account ,u.name
HAVING SUM(t.amount)>10000;

