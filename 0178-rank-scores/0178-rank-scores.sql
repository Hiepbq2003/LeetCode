# Write your MySQL query statement below
select s1.score,
COUNT(DISTINCT s2.score) AS 'rank'
from Scores s1
join Scores s2
on s2.score >= s1.score
group by s1.id , s1.score
order by s1.score desc