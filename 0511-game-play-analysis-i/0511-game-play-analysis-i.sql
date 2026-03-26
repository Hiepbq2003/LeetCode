# Write your MySQL query statement below
select distinct 
a1.player_id , a1.event_date  as first_login 
from Activity a1 
left join Activity a2 on a1.player_id = a2.player_id 
and a1.event_date > a2.event_date
where a2.event_date is null