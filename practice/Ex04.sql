/*
문제1.
평균 급여보다 적은 급여을 받는 직원은 몇명인지 구하시요
(56건)
*/
select count(salary)
from employees
where salary < (select avg(salary)
                from employees);

--salary < 6461

/*
문제2.
평균급여 이상, 최대급여 이하의 월급을 받는 사원의
직원번호(employee_id), 이름 (first_name), 급여 (salary), 평균급여 , 최대급여를 
급여의 오름차순으로 정렬하여 출력하세요
(51건)
*/
--1. 평균급여 이상 최대급여 이하 월급 받는 사원
--최대 급여
select salary
from employees
where salary =(select max(salary)
               from employees); --24000
--평균 급여               
select salary
from employees
where salary >= (select avg(salary)
                 from employees) --6461
order by salary asc;

--.식조합
select employee_id 직원번호,
       first_name 이름,
       salary 급여,
       avg(salary) 평균급여,
       max(salary) 최대급여
from employees
where salary in (select salary
                 from employees
                 where salary between 6461 and 24000)
group by employee_id, first_name, salary
order by salary asc;

/*
3.문제
직원중Steven(first_name) king(last_name) 이 소속된 부서 ( 가 있는 곳의 주소
를 알아보려고 한다
도시아이디(location_id), 거리명 (street_address), 우편번호 (postal_code), 도시명 (city), 주
(state_province), 나라아이디 (country_id) 를 출력하세요
(1건)
*/