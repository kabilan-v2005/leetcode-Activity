# Write your MySQL query statement below
-- SELECT tweet_id 
-- FROM Tweets
-- WHERE CHAR_LENGTH(CONTENT)>15
select tweet_id from Tweets where length(content)>15;