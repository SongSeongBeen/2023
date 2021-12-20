/**************
join
***************/

--카티젼 프로덕트(Cartesian Product)
--col:15  row:2889
select *
from employees, departments;

select  em.employee_id,
        em.first_name,
        em.salary,
        de.department_name,
        em.department_id,
        de.department_id
from employees em, departments de
where em.department_id = de.department_id;


select  em.first_name,
        de.department_name,
        jo.job_title
from employees em, departments de, jobs jo
where em.department_id = de.department_id
and   em.job_id = jo.job_id
order by em.first_name asc
;


select  count(*)
from employees em, departments de, jobs jo
where em.department_id = de.department_id
and   em.job_id = jo.job_id





-- c11 r107 
select  employee_id,
        first_name,
        salary,
        job_id,
        department_id
from employees; 

--c04  r27
select *
from departments;

select *
from jobs;

--equi join
select first_name,
       salary,
       de.department_id,
       de.department_name
from employees em, departments de
where em.department_id = de.department_id;

select em.first_name,
       de.department_name,
       job.job_title
from employees em, jobs job, departments de
where em.department_id = de.department_id
and em.job_id = job.job_id;

--outer join          --왼쪽 기준  ( null 제외)
--left outer join    --오른쪽null  값만 포함 
select em.first_name,
          em.salary,
          em.department_id,
          de.department_id,
          de.department_name
from employees em left outer join departments de
on em.department_id = de.department_id;

--오라클 표현
select *
from employees em, departments de
where em.department_id = de.department_id(+);
-- and em.employee_id = 178; 확인용

select *           
from employees em
where em.department_id is null;  -- 확일을 위해 null값도 찾아보다.

--outer join        --오른쪽 기준  ( null 제외)
--right outer join --왼쪽 null  값만 포함 
select em.first_name,
          em.salary,
          em.department_id,
          de.department_id,
          de.department_name
from employees em right outer join departments de
on em.department_id = de.department_id;

--오라클 표현
select *
from employees em, departments de
where em.department_id(+) = de.department_id;

--이렇게 사용 못함 where절 양쪽에 (+)를 붙이지 못한다
/*
select  em.first_name,
        em.salary,
        em.department_id,
        de.department_id,
        de.department_name
from employees em, departments de
on em.department_id(+) = de.department_id(+);
*/

--full outer join
select em.department_id, 
            em.first_name,
            de.department_name
from employees em full outer join departments de
on e.department_id = d.department_id ;

--self join   --> 직원테이블 부서테이블 조인 문과 비교
select em.employee_id,
            em.first_name,
            em.salary,
            em.phone_number,
            em.manager_id,
            ma.employee_id,
            ma.first_name,
            ma.phone_number,
            ma.email
from employees em, employees ma
where em.manager_id = ma.employee_id;

select employee_id,
             first_name,
             salary,
             manager_id
from employees;

/*
--잘못된 조인
select  em.employee_id,
        em.first_name,
        em.salary,
        lo.location_id,
        lo.city
from employees em, locations lo
where em.salary = lo.location_id;
*/

