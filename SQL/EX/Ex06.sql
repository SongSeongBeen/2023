/**************
Sub_Query
***************/
--1)전체쿼리문 구조
select first_name,
            salary
from employees
where salary >' 딘의 급여';
--2) Den의 급여
select first_name,
            salary
from employees
where first_name = 'Den'
or salary > 11000;
--3) Query문 완성  -->들여쓰기 잘 할것
select first_name,
            salary,
            department_id,
            phone_number
from   employees
where salary > (select salary
                             from   employees
                             where first_name ='Den');
                             
--예제
--급여를 가장 적게 받는 사람의 이름, 급여 , 사원번호는
--1.가장 낮은 급여
select min(salary)
from employees;

--2.급여가 가장 낮은사람
select first_name, 
            salary,
            employee_id
from   employees
where salary = 2100;

select first_name,
             salary,
             employee_id
from employees
where salary = (select min(salary)
                            from employees);
                            
--평균 급여보다 적게 받는 사람의 이름, 급여를 출력하세요?
select first_name,
             salary
from employees
where salary < (select avg(salary) --6461
                            from employees);
                            
select avg(salary)
from employees;    

--3. 식 조합
select employee_id,
       salary
from employees
where salary in (select salary
                 from employees
                 where department_id = 110);
-- 부서번호가 110인 직원 리스트 -->모든 직원 12008 인사람구하기 3
-->부서번호가 110인 직원 리스트 -->모든 직원 8300인 사람 구하기 2
select employee_id,
       first_name,
       salary,
       department_id
from employees
where  department_id = 110;

--급여를 12008 받는 직원리스트 --> Nancy, Shelley
--급여를 8300 받는 직원리스트 --> Willam
select employee_id,
       first_name,
       salary,
       department_id
from employees
where  department_id = 12008;
/**************
Sub_Query(다중행)
***************/
--부서번호가 110인 직원의 급여와 같은 모든 직원의 사번, 이름, 급여를 출력하세요
--1. 부서번호가 100인 직원의 급여 리스트를 구한다.

-- 12008 8300
select salary
from employees
where department_id = 110;

--2. 급여가 12008,8300 인 직원의 리스트를 구한다
select employee_id,
       first_name,
       salary
from employees
where salary = 12008
or salary = 8300;

select employee_id,
       first_name,
       salary
from employees
where salary in(12008, 8300);

--3 두식을 조합한다. --in
select employee_id,
       first_name,
       salary
from employees
where salary in(select salary
                from employees
                where department_id = 110);
                
--각 부서별로 최고 급여를 받는 사원을 출력하세요
select department_id,
       max(salary)
from employees
group by department_id;

select department_id,
       salary
from employees;
--in
select department_id,
       first_name,
       salary
from employees                 --자리 맞춰서 써줘야 한다.
where (department_id, salary) in(select department_id,      --(=,<,>,<=,>=) 값이 맞으면 조건설정 가능
                                        max(salary)
                                 from employees
                                 group by department_id)
order by department_id asc;

--any_연산자
--부서번호가 110인 직원의 급여보다 큰 모든 직원의
--사번, 이름, 급여를 출력하세요.(or연산자 --> 8300보다 큰)

--1.부서번호가 110인 직원의 급여

select salary
from employees
where department_id = 110;

--2.부서번호가 110인(12008,8300) 보다 급여가 큰직원리스트(사번, 이름, 급여)를 출력
select employee_id,
     first_name,
     salary
from employees
where salary > 12008
or salary > 8300;

--조합_any
select employee_id,
     first_name,
     salary
from employees
where salary >any (select salary   --any = or
                   from employees
                   where department_id = 110);
        
--,조합_all                  
select employee_id,
     first_name,
     salary
from employees
where salary >all (select salary  
                   from employees
                   where department_id = 110);

--Sub_Query_Join
--각부서별 
select em.first_name,
       em.salary,
       em.department_id,
       ms.department_id,
       ms.salary
from employees em, (select department_id,
                            max(salary)
                            from employees
                            group by department_id)ms
where em.department_id = ms.department_id
and em.salary = ms.salary;    