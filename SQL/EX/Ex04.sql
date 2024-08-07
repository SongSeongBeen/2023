/**************
group by 절
***************/
select avg(salary), 
       department_id
from employees
group by department_id   --참여한 컬럼이나 그룹함수만 올수있다.
order by department_id; 

select department_id, --참여한 컬럼이나 그룹함수만 올수있다.
       count(*),
       sum(salary)
from employees
group by department_id; --참여한 컬럼이나 그룹함수만 올수있다.

select department_id,
       count(*),
       avg(salary)
from employee
group by department_id;

select department_id,
       count(*),
       avg(salary)
from employee
group by department_id, job_id
order by department_id asc, jod_id desc;

--예제
select department_id, count(*), sum(salary)
from employees
--where sum(salary) > 20000 --where 절에는 그룹함수를 쓸 수 없다.
group by department_id;

--having절
select department_id, count(*), sum(salary)
from employees
group by department_id
having sum(salary) >= 20000; --having 절에는 그룹함수와 Group by에참여한컬럼만사용할수있다

--and, or
select department_id, count(*), sum(salary)
from employees
group by department_id
having sum(salary) >= 20000
or department_id = 40    --둘중하나 만족
and department_id = 40;    --둘다만족

--CASE ~END 문   
select employee_id,     
       first_name,
       salary,
       case when job_id = 'AC_ACCOUNT' then salary + salary*0.1
            when job_id = 'SA_REP' then salary + salary*0.2
            when job_id = 'ST_CLERK' then salary + salary*0.2
            else salary
       end  bouns
from employees;

--DECODE()         
select employee_id,
       first_name,
       salary, 
       --(==)일때만 가능
       DECODE( job_id, 'AC_ACCOUNT', salary + salary * 0.1,
                       'SA_REP', salary + salary * 0.2,
                       'ST_CLERK', salary + salary * 0.3,
               salary) realSalary
from employees;

select first_name 이름,
       department_iD,
         case when department_id >= 10 and department_id <= 50 then 'A-TEAM'
             when department_id >= 60 and department_id <= 100 then 'B-TEAM'
             when department_id >= 110 and department_id <= 150 then 'C-TEAM'
             else '팀없음'
        end as team
        from employees;
        
select first_name 이름,
department_iD,
       case when department_id between 10 and 50   then 'A-TEAM'
            when department_id between 60 and 100  then 'B-TEAM'
            when department_id between 110 and 150 then 'C-TEAM'
            else '팀없음'
       end 부서
from employees;