/**************
Wedbd_Table_Create 
***************/
--webdb 계정에 book 테이블 만들기
create table book(
    book_id number(5),
    title varchar2(50),
    author varchar2(10),
    pub_date date
);

--book테이블에 pubs 컬럼 추가하기
alter table book add(pubs varchar2(50));

--book테이블에 컬럼속성 변경하기
alter table book modify(title varchar2(100));

--컬럼명 변경
alter table book rename column title to subject;

--컬럼 삭제
alter table book drop(author);

--테이블 명 변경하기
rename book to article;

--테이블 삭제
drop table author;
drop table book;

--author 테이블 만들기
CREATE TABLE author (
     author_id number(10),    --pk
     author_name varchar2(100) not null,
     author_desc varchar2(500),
     PRIMARY KEY(author_id)
);

--book 테이블 만들기
CREATE TABLE book (
  book_id	  number(10),
  title	      varchar2(100) 	not null,
  pubs	      varchar2(100),
  pub_date	  date,
  author_id   number(10),
  PRIMARY 	  KEY(book_id),
  CONSTRAINT book_fk FOREIGN KEY (author_id)
  REFERENCES author(author_id)
);

--author 테이블에 데이터 추가(insert)
insert into author
values(1, '박경리', '토지 작가');

insert into author(author_id, author_name, author_desc)
values(2, '이문열', '삼국지등등 작가');

insert into author(author_id, author_name, author_desc)
values(3, '기안84', '웹툰작가');

--작가 테이블 정보 수정  --식별자로 위치 정함(주의 해서 사용)
update author 
set author_name = '김경리',    
    author_desc = '토지작가'
where author_id = 1;         

-- 없을 경우 전체다 바뀐다 (주의 해서 사용)
update author 
set author_name = '김경리',    
    author_desc = '토지작가';

--작가테이블 정보 삭제 (주의 해서 사용)
--where 절 없음
delete from author;      --데이터만 삭제

--sequence(시퀀스) 번호표
--연속적인 일련번호 생성
create sequence seq_author_id
increment by 1
start with 1
nocache;

insert into author
values(seq_author_id.nextval,'박경리', '토지 작가');

--시퀀스 조회
select *from user_sequences;

--현재 시퀀스 조회
select seq_author_id.currval
from dual;

--다음 시퀀스 조회
select seq_author_id.nextval
from dual;

--시퀀스 삭제
drop squence seq_author_id;

select * from book;
select * from author;

--만들어진 전체 테이블 조회
SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' 
FROM user_tables; 

--현재시간입력됨
--INSERT INTO board VALUES (1, ‘게시판제목', ＇본문내용‘, SYSDATE ); --sysdate

