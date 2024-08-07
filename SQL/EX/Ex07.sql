/**************
Rownum 
***************/
--급여를 가장 많이 받는 5명의 직원의 이름을 출력하시오.
select max(salary)
from employees;

select first_name,
           salary
from employees
where salary = (select max(salary)
                            from employees);
--rownum   
--1.rownum 가져오기
select rownum rnum, --실제 컬럼명처럼 숫자가 온다 데이터처럼 사용가능
            first_name,
            salary
from employees;
--2.급여순으로 정렬 -->rownum 섞여버림
select rownum rnum, --실제 컬럼명처럼 숫자가 온다 데이터처럼 사용가능
            first_name,
            salary
from employees
order by salary desc;

select rownum,
            em. first_name,
            em.salary,
            em.department_id,
            em.email,
            sdes.fn,
            sdes.salary
from employees em, (select first_name fn, -- 출력할때 fn로 해줘야한다.
                                                   salary
                                       from employees
                                       order by salary desc)  sdes
where rownum between 1 and  5;

select r.rno,
            r. first_name,
            r.salary
from  (select rownum rno,
                         o.first_name,
                         o.salary
              from  (select first_name, -- 출력할때 fn로 해줘야한다.
                                       salary
                                       from employees
                                       order by salary desc)o
            ) r
where  r.rno between 2 and  4;

--예제
--07년에 입사한 직원중 급여가 많은 직원중 3에서 7등의 이름 급여 입사일은?
--1 07년입사 월급
select hire_date "07년 입사자",
            salary 급여
from employees
where hire_date between '07/01/01' and '07/12/31'
order by salary desc;
--식조합
select r.rno,
           hire_date  "07년 입사자",
            salary 급여
from  (select rownum rno,         --번호 작성
                         o.hire_date,
                         o.salary
             from  (select hire_date, -- 출력할때 fn로 해줘야한다.
                                     salary
                                     from employees
                                     order by salary desc)o
            ) r
where  r.rno between 3 and  7;

--07년에 입사한 직원중 급여가 많은 직원중 3에서 7등의 이름 급여 입사일, 부서명은?
select r.rno,
       r.hire_date  "07년 입사자",
       r.salary 급여,
        r.department_name
from   (select rownum rno,  
               eme.hire_date,
               eme.salary,
               eme.department_id,
               eme.department_name
         from  (select em.hire_date, -- 출력할때 fn로 해줘야한다.
                       em.salary,
                       em.department_id,
                       de.department_name
                from   employees em, departments de
                where  hire_date between '07/01/01' and '07/12/31'
                and    em.department_id=de.department_id
                order by salary desc) eme 
        ) r
where r.rno between 3 and  7;