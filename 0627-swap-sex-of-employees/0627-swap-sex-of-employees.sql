# Write your MySQL query statement below
Update  Salary 
SET sex = case
When sex = 'm' then 'f'
else 'm'
end;