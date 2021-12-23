/**************
Table_CREATE 과제
***************/
--실행순서-- 1(author tabel 만들기)  
CREATE TABLE    author(
    author_id   number(10),
    author_name varchar2(100),
    author_desc varchar2(100),
    PRIMARY KEY (author_id)
);

--실행순서-- 1-2(순번 자동 생성) 
create sequence seq_author_id     
increment by 1
start with 1
nocache; --디폴트

--실행순서-- 1-3(author정보입력)  
--1
insert into author
values(seq_author_id .nextval, '이문열', '경북 영양');
--2
insert into author
values(seq_author_id .nextval, '박경리', '경상남도 통영');
--3
insert into author
values(seq_author_id .nextval, '유시민', '17대 국회의원');
--4
insert into author
values(seq_author_id .nextval, '기안84', '기안동에서 산 84년생');
--5
insert into author
values(seq_author_id .nextval, '강풀', '온라인 만화가 1세대');
--6
insert into author
values(seq_author_id .nextval, '김영하', '알쓸신잡');

--실행순서-- 2(book table 만들기) 
CREATE TABLE    book( 
    book_id     number(20),
    title       varchar2(100),
    pubs        varchar2(100),
    pub_date    date,
    author_id   number(20),
    PRIMARY KEY (book_id),
    CONSTRAINT  book_fk FOREIGN KEY (author_id)
    REFERENCES  author(author_id)
);

--실행순서-- 2-2(시퀀스 자동번호)
create sequence seq_book_id
increment by 1
start with 1
nocache;

--실행순서-- 2-3(book정보입력) 
--1
insert into book
values(seq_book_id.nextval, '우리들의 일그러진 영웅','다림', '1998-02-22', 1);
--2
insert into book
values(seq_book_id.nextval, '삼국지','민음사', '2002-03-01', 1);
--3
insert into book
values(seq_book_id.nextval, '토지','마로니에북스', '2012-08-15', 2);
--4
insert into book
values(seq_book_id.nextval, '유시민의 글쓰기 특강','생각의길', '2015-04-01', 3);
--5
insert into book
values(seq_book_id.nextval, '패션왕','중앙북스(books)', '2012-02-22', 4);
--6
insert into book
values(seq_book_id.nextval, '순정만화','재미주의', '2011-08-03', 5);
--7
insert into book
values(seq_book_id.nextval, '오직두사람','문학동네', '2017-05-04', 6);
--8
insert into book
values(seq_book_id.nextval, '26년','재미주의', '2012-0204', 5);

--테이블 조회
select b.book_id,
       b.title,
       b.pubs,
       b.pub_date,
       b.author_id,
       a.author_name,
       a.author_desc
from  author a, book b
where a.author_id = b.author_id;