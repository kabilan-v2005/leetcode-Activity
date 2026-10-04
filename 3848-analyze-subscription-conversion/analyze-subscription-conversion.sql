# Write your MySQL query statement below
    SELECT user_id,
    round(avg(case when activity_type = 'free_trial' Then activity_duration END),2) as trial_avg_duration,
    round(avg(case when activity_type = 'paid' Then activity_duration END),2) as paid_avg_duration
    FROM UserActivity
    GROUP BY user_id
    HAVING SUM(CASE WHEN activity_type = 'paid' THEN 1 ELSE 0 END) > 0
    and SUM(CASE WHEN activity_type = 'free_trial' THEN 1 ELSE 0 END) > 0
    order by user_id asc
    
    

