/*
문제 1. 
전체직원의 다음 정보를 조회하세요. 
정렬은 입사일(hire_date)의 올림차순(ASC)으로 가장 선임부터 출력이 되도록 하세요. 
이름(first_name last_name), 
월급(salary),  
전화번호(phone_number), 
입사일(hire_date) 
순서이고 “이름”, “월급”, “전화번호”, “입사일” 로 컬럼이름을 대체해 보세요.
*/
select first_name || ' '|| last_name 이름, 
       salary 급여,
       phone_number 전화번호,
       hire_date 입사일
from   employees
order by hire_date asc; --입사일 오름차순 정렬

/*
문제2.
업무(jobs)별로 
업무이름(job_title)과 
최고월급(max_salary)을 
월급의 내림차순(DESC)로 정렬하세요.
*/
select job_title 업무명,
       max_salary 최대급여
from   jobs
order by max_salary desc, job_title desc;
/*
문제3.
담당 매니저가 배정되어있으나 커미션비율이 없고, 
월급이 3000초과인 
직원의 이름, 
매니저아이디, 
미션 비율, 
월급 을 출력하세요.
*/
select first_name 이름,
       manager_id 관리자아이디,
       commission_pct 수당,
       salary 급여
from   employees
where salary > 3000
and commission_pct is null --커미션 비율 없는 사람
and  manager_id is not null; --매니저 없는 사람 제외
/*
문제4.
최고월급(max_salary)이 10000 이상인 
업무의 이름(job_title)과 
최고월급(max_salary)을 최고월급의(max_salary) 
내림차순(DESC)로 정렬하여 출력하세요
*/
select job_title 업무명,
       max_salary 최대급여
from   jobs
where max_salary >= 10000 --최고 급여가 10000이상
order by max_salary desc;
/*
문제5.
월급이 14000 미만 10000 이상인 
직원의 이름(first_name), 
월급, 
커미션퍼센트 를  
월급순(내림차순) 출력하세오. 
단 커미션퍼센트 가 null 이면 0 으로 나타내시오
*/
select first_name 이름, 
       salary 급여, 
       nvl(commission_pct, 0) 커미션퍼센트--null 0으로 변경
from   employees
where salary < 14000 --미만
or    salary >=10000 --이상
order by salary desc,  commission_pct desc; --월급순 내림차순
/*
문제6.
부서번호가 10, 90, 100 인 
직원의 이름, 
      월급, 
      입사일, 
      부서번호를 나타내시오
입사일은 1977-12 와 같이 표시하시오
*/
select first_name 이름,
       salary 급여,
       to_char(hire_date,'YYYY"-"MM') 입사일,
       department_id 부서번호
from   employees
where department_id in (100, 90, 10); 

/*
문제7.
이름(first_name)에 S 또는 s 가 들어가는 직원의 이름, 월급을 나타내시오
*/
select first_name 이름, 
       salary 월급
from   employees
where lower(first_name) like '%s%'; --lower( ) 대소문자 구분없이 찾기
/*
문제8.
전체 부서를 출력하려고 합니다. 
순서는 부서이름이 긴 순서대로 출력해 보세오.
*/
select department_name
from departments
order by length(department_name)desc; --순서대로 정렬하고 순서에대한 내림차순으로
/*
문제9.
정확하지 않지만, 지사가 있을 것으로 예상되는 
나라들을 나라이름을 대문자로 출력하고
올림차순(ASC)으로 정렬해 보세오.
*/
select upper(country_name) --대문자 변환
from countries
order by country_name asc;

/*
문제10.
입사일이 03/12/31 일 이전 
입사한 직원의 
이름, 
월급, 
전화 번호, 
입사일을 출력하세요
전화번호는 545-343-3433 과 같은 형태로 출력하시오.
*/
select first_name 이름,
       salary 월급,
       replace(phone_number,'.', '-'),
       hire_date 입사일
from   employees
--where regexp_like(phone_number, '0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}');
where hire_date < '03/12/31'; --문자열로
