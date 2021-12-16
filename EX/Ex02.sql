/**************
함수
***************/
/**************
단일행 함수
***************/
--가상의 테이블
select sysdate   --저장
from dual;       --가상의 테이블 생성

--문자함수--INITCAP(컬럼명)--
select email "E-mail", --제목 표기할때만 쌍따음표
        initcap(email),
       department_id
from employees
where department_id =100;

--문자함수--LOWER(컬럼명)--UPPER(컬럼명)--
select first_name,  --자동으로 숫자 1 2 3 표기
       lower(first_name) l_first_name,
       upper(first_name) u_first_name
from employees
where department_id = 100;

--문자함수--SUBSTR(컬럼명, 시작위치, 글자수)
select first_name,
       substr (first_name,1,3), --왼쪽 -> 오른쪽으로검색해서 글자수 만큼 추출
       substr (first_name,-3,2) --오른쪽 -> 왼쪽 검색 후 왼쪽->오른쪽으로 글자수 추출
from employees
where department_id = 100;

--문자함수-- LPAD(컬럼명, 자리수, '채울문자') / RPAD(컬럼명,'채울문자')
select first_name,
       lpad(first_name,10,'*'), 
       rpad(first_name,10,'*')
from employees;

--문자함수-- REPLACE (컬럼명, 문자1, 문자2)
select first_name,
       replace(first_name, 'o', '****') --지정문자 입력 * 수 만큼 가려준다
from employees
where department_id = 100;

select first_name,
       replace(first_name, substr(first_name,2,3), '****')  
from employees
where department_id = 100;

--숫자함수-- ROUND(숫자, 출력을원하는자리수)
--주어진 숫자의 반올림 하는 함수
select round(123.346, 2) "r2", --값 입력
round(123.456, 0) "r0",
round(123.456, -1) "r-1"  
from dual;           --가상 테이블 생성

--숫자함수-- TRUNC(숫자, 출력을원하는자리수)
--주어진 숫자의 버림을 하는 함수
select trunc(123.346, 2) "r2", --(값 입력)
trunc(123.456, 0) "r0",
trunc(123.456, -1) "r-1"
from dual;  --가상 테이블

--날짜함수-- SYSDATE()
select sysdate
from dual;

select sysdate,
       hire_date,
       round (months_between(sysdate, hire_date), 0),
       trunc (months_between(hire_date, sysdate), 0) --버림 하겠다
from employees
where department_id= 100;

-- TO_CHAR(숫자, ‘출력모양’) 숫자형문자형으 로변환하기
select first_name,
       salary,
       to_char(salary*12, '99999999'), --$표시방법 9는 자리수
       to_char(salary*12, '00009999'),
       to_char(salary*12, '$9999999'),
       to_char(salary*12, '99999.9999'),
       to_char(salary*12, '999.999.999.999')
from employees
where department_id = 100;

--변환함수>TO_CHAR(날짜, '출력모양') 날짜->문자형으로 변환하기
select sysdate,
       to_char(sysdate, 'yyyy'), --년
       to_char(sysdate, 'MM'),   --월
       hire_date,
       to_char(hire_date, 'MM'),   --월
       to_char(sysdate, 'DD'),    --일
       to_char(sysdate, 'HH24'),  --시간 24 '숫자'없으면 오전오후
       to_char(sysdate, 'MI'),    --분
       to_char(sysdate, 'SS')    --초
from dual; 

select sysdate,
       to_char(sysdate, 'yyyy"년"MM"월"DD"일" DAY HH24:MI:SS') --년 월 일 (/,-) 시 분 초
from dual; 
--숫자로 관리하고 있다.
--1990/01/01 00:00:00 데이터는 0으로 저장
--1990/01/01 00:00:01 데이터는 1으로 저장

--일반함수--NVL(컬럼명, null일때값)/NVL2(컬럼명, null아닐때값, null일때값)
--NVL(조사할컬럼, NULL 일경우치환할값)
--NVL2(조사할컬럼, NULL이아닐때치환할값, NULL일때치환할값)
select commission_pct, 
       nvl(commission_pct, 0) --평균같이 계산에 참여해야할 경우 NULL을 0으로 변경해준다
from employees;    

select commission_pct, 
       nvl2(commission_pct, 100, 0)  --NUll이 아닐떄 100
from employees;    
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