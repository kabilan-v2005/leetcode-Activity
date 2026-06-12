# Write your MySQL query statement below

select transaction_date,
SUM(
    case 
        when amount % 2 != 0 then amount
        else 0
    end
) as odd_sum,
SUM(
    case 
        when amount % 2 = 0 then amount
        else 0
    end
) as even_sum
from transactions
GROUP by transaction_date
ORDER BY  transaction_date