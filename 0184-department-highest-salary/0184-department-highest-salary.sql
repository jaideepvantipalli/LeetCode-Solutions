/* Write your PL/SQL query statement below */
select d.name as Department,e.name as Employee,e.salary as Salary
from Employee e join Department d
on e.departmentId=d.id
where (e.departmentId,salary) in (
    select e1.departmentId,max(e1.salary) from Employee e1 group by e1.departmentId
);