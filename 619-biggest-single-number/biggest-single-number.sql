# Write your MySQL query statement belo
select max(num) as num
from(
    select num
    from MyNumbers
    group by num
    Having count(num) <= 1
) as t