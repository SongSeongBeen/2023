/**************
Sub query
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