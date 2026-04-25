# Write your MySQL query statement below
SELECT actor_id,  director_id 
FROM ActorDirector 
group by actor_id,director_id
having count(director_id) >=3

