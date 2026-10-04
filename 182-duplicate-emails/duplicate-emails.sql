# Write your MySQL query statement below
SELECT Email
from Person
group by email
having count(*) > 1