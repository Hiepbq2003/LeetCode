# Write your MySQL query statement belo
SELECT p.project_id , 
Round(AVG(e.experience_years), 2 ) as average_years
From Project p
join Employee e on e.employee_id = p.employee_id 
group by p.project_id