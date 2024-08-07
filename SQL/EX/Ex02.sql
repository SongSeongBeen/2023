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
       upper(first_name) u_first_name,         --대문자 변환
       lower(first_name) l_first_name,         --소문자 변환
       initcap((first_name) l_first_name       --첫글자만 대문자 변환
from employees
where department_id = 100;

--문자함수--SUBSTR(컬럼명, 시작위치, 글자수)
select first_name,
       substr (first_name, 1,3), --왼쪽 -> 1번째 글자부터 4개 자르기
       substr (first_name, 1), --왼쪽 -> 1번째 글자부터 끝까지 자르기
       substr (first_name, -3), --오른쪽 -> 뒤에서 3번째 글자부터 끝까지 자르기
       substr (first_name, -3,2) --오른쪽 -> 뒤에서 3번째 글자부터 2글자자르기
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
