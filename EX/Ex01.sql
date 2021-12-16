/**************
select 문
***************/

/**************
select 절
from 절
***************/

–DML ( Data Manipulation Language): 데이터조작어로검색및수정하기위한수단제공SELECT, INSERT, UPDATE, DELETE
–DDL ( Data Definition Language ): 데이터구조를생성, 변경, 삭제등의기능을제공CREATE, ALTER, DROP, RENAME
–DCL ( Data Control Language ): 데이터에대한권한관리및트랜잭션제어GRANT, REVOKE

*/
--직원테이블 전체 조회
select  * 
from    employees;

--부서테이블 전체 조회
select  * 
from    departments;

--원하는 컬럼만 조회
select  employee_id, 
        first_name, 
        last_name 
from    employees;

--예제    
select  first_name,
        last_name,
        salary,
        phone_number,
        email,
        hire_date
from    employees;   
 
--출력할 컬럼명 별명적용하기
select  employee_id as empNO, --가져온 다음 출력해준다.(대소문자 구분x)
        first_name as "f-name", --특수문자 공백 대소문자구분 ""(쌍 따옴표)
        salary as "연 봉" --마지막줄 ,없이 한다
from    employees;

--예제
select  fisrt_name as 이름, 
        phone_number as 전화번호,
        hire_date as 입사입,
        salary as 급여
from    employees;
--as 제외
select  employee_id 사원번호, --as 제외하고 사용
        first_name as 이름,
        last_name as 성,
        salary as 급여,
        phone_number as 전화번호,
        email as 이메일,
        hire_date as 입사일
from    employees;
--연결 연산자(concatenation)로 컬럼 붙이기
select  first_name, last_name
from    employees;

select  first_name || last_name
from    employees;

select first_name|| ' ' || last_name name
from employees;

--산술 연산자 사용
select first name, 
salary 월급 --월급
from employees;

select first name, salary, salary*12 연봉--연봉
from employees;

select first name, salary, salary*12,(salary+300)*12
from employees;

--예제
select  job_id   --*12 숫자만 가능 
from    employees;

select  first_name || '-' || Last_name "성 명", --"" 공백&대소문자 구분
        salary 급여,
        salary *12 연봉,
        (salary*12)+5000 연봉2,
        phone_number 전화번호
from    employees;
/*
select
 from employees
 where 절
*/
select  first_name,
        last_name,
        salary,
        department_id
from    employees
where   department_id >= 10; --조건 추가
--예제
--월급이 5000 이상인 사원들의 이름과 월급을 출력 하세요
select  first_name,
        salary
from    employees
where   salary >= 5000;
--07/01/01일 이후에 입사한 사원들의 이름과 입사일을 출력하세요
select  first_name,
        hire_date
from    employees 
where   hire_date > '07/01/01'; --날짜''로 표시

--이름이 Lex인 직원의 연봉을 출력하세요
select  salary*12
from    employees
where   first_name = 'Lex';     --''대소문자구분  

--조건이 2개이상 일때 한꺼번에 조회하기
--연봉이 14000 이상 17000이하인 사원의 이름과 연봉을 구하시오
select  first_name, salary
from    employees
where   salary >= 14000
and     salary <= 17000
;
--연봉이 1400 이하이거나 17000 이상인 사원의 이름과 연봉을 출력하세요
select  first_name 이름,
        salary 연봉
from    employees
where   salary <= 14000 
or      salary >= 17000
;
--입사일이04/01/01 에서05/12/31 사이의사원의이름과입사일을출력하세요
select  first_name 이름,
        hire_date 입사일
from    employees
where   hire_date >= '04/01/01' 
and     hire_date <= '05/12/31';

--BETWEEN 연산자로 특정구간 값 출력하기
select  first_name,
        salary
from    employees
where   salary between 14000 and 17000; --작은값 부터 큰값까지 순서 지키기

--IN 연산자로 여러 조건을 검사하기     
select  *
from    employees
where   first_name = 'Neena' 
or      first_name = 'JOhn'
or      first_name = 'Lex'; 
--IN
select  first_name,
        last_name,
        salary
from    employees
where   first_name in ('Neena', 'John', 'Lex');

select  first_name,
        last_name,
        salary
from    employees
where   salary in (2100, 3100, 4100, 5100);

     
--Like 연산자로 비슷한것들 모두 찾기
select  first_name,
        salary
from    employees
where   first_name like 'L%'; --L(%포함하고있는) 다 찾다.

--이름에am 을포함한사원의이름과연봉을출력하세요
select  first_name,
        salary
from    employees
where   first_name like '%am%'; --앞뒤 상관없이 찾다.
--이름의두번째글자가a 인사원의이름과연봉을출력하세요
select  first_name,
        salary
from    employees
where   first_name like '_a%'; --_(언더바)한번am 
--이름의네번째글자가a 인사원의이름을출력하세요
select  first_name,
        salary
from    employees
where   first_name like '____a%'; --_(언더바)am 네번
--이름이4글자인사원중끝에서두번째글자가a인사원의이름을출력하세요
select  first_name,
        salary
from    employees
where   first_name like '____a__%'; --_(언더바)am 네번

--NULL
select  first_name,
        salary,
        commission_pct,
        salary*commission_pct   --NULL 을포함한 산술식은 NULL
from    employees
where   salary between 13000 and 15000;

--is null / is not null
select  first_name,
        salary,
        commission_pct
from  employees
where  commission_pct is null;

--예제
--커미션비율이있는사원의이름과연봉커미션비율을출력하세요
select  first_name,
        salary
from  employees
where  commission_pct is not null;
--담당매니저가없고커미션비율이없는직원의이름을출력하세요
select  first_name,
        salary
from  employees
where  cmanager_id is null
and commission is null;

--ORDER BY 절
select *
from  employees
order by salary desc;   -- desc(내림차순) -큰거부터 작은거  
                       -- asc(오름차순) - 작은거부터 큰거                   
select *
from  employees
order by salary asc, first_name asc; --급여 오름차순 --이름 오른차순

select *
from  employees
where salary >= 9000
order by salary asc;

select department_id,
       salary,
       first_name
from employees
order by department_id asc;  --오름차순

select first_name,
       salary
from employees
where salary >= 10000
order by salary desc;        --내림차순

select department_id,
       salary,
       first_name
from employees
order by department_id asc, salary desc;

