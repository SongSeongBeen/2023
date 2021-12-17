/**************
   그 룹 함 수
***************/
--오류발생 이유확인할것--> 1개의 row에 표현할 수 없다.
select first_name,
       avg(salary)
from employees; 

--그룹함수 AVG()
select avg(salary)
from employees;

--그룹함수 COUNT()
select conut
from employees;

select count(*),   --null 포함
       count(commission_pct), --pct null 제외
        count(department_id)   
from employees;

select count(*) 
from employees
where salary > 16000;

--부서번호가 100인 사람의 갯수
select count(*)
from employees
where department_id = 100;

--그룹함수 SUM()
select count(*), 
       sum(salary)
from employees;

--그룹함수 avg()
--입력된 값들의 평균값을 구하는 함수
--주의:null 값이 있는 경우 빼고 계산함 - nvl함수와 같이 사용
select sum(salary), 
       count(*),
       avg(salary)
from employees;

select count(*),
       sum(salary), 
       avg(nvl(salary,0)) --월급과 null 인경우 0
from employees;

--그룹함수 MAX/MIN
select count(*),
        max(salary),  --최대값
        min(salary)   --최소값
from employees;