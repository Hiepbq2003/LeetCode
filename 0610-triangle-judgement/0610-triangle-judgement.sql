# Write your MySQL query statement below
select * , IF(x + y > z AND y + z > x and x + z > y , "Yes" ,"No") as triangle from Triangle 