# Write your MySQL query statement below 
Select
    Case 
    When Count(*) > 0 THEN  MAX(num)
    else null
    end as num
    from 
    (
        select * from MyNumbers 
        group by num 
        having count(*) = 1

    ) as none
  
