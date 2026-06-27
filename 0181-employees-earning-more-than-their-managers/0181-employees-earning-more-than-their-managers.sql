select e.name as Employee from Employee e,Employee mg
where e.managerId=mg.id and e.salary > mg.salary;