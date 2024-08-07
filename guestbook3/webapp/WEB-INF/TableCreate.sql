-------------게스트방명록
--테이블 삭제
drop table guestbook;

--시퀀스 삭제
drop sequence seq_guestbook;


create table guestbook(
    no        number,
    name      varchar2(20),
    password varchar2(20),
    content    varchar2(2000),
    reg_date date,
    PRIMARY KEY(no));

--시퀀스 생성
CREATE SEQUENCE seq_guestbook_no
INCREMENT BY 1 
start with 1 
nocache;

insert into guestbook
values(seq_guestbook_no.nextval, '송성빈', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '전지현', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '장동건', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '원빈', '1234', '출췍완료', sysdate);
insert into guestbook
values(seq_guestbook_no.nextval, '임수정', '1234', '출췍완료', sysdate);

commit;
