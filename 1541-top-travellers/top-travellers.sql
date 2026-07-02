# Write your MySQL query statement below
Select n.name,COALESCE(SUM(r.distance), 0) as travelled_distance 
From Users n
left join Rides r
On n.id = r.user_id
group by n.id,n.name
Order by travelled_distance DESC,n.name asc;