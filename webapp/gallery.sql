select count(id)
from users
where id = 'hiy';

select *
from users;

create


--author 테이블 만들기
CREATE TABLE author (
     author_id number(10),    --pk
     author_name varchar2(100) not null,
     author_desc varchar2(500),
     PRIMARY KEY(author_id)
);

--테이블 삭제
drop table gallery;

--시퀀스 삭제
drop sequence seq_gallery_no;

--실행순서-- 1-2(순번 자동 생성) 
create sequence seq_gallery_no     
increment by 1
start with 1
nocache; --디폴트

--테이블 만들기
CREATE TABLE gallery (
  no	     number,
  user_no	 number,
  content	 varchar2(1000) ,
  file_path	 varchar2(500),
  org_name   varchar2(500),
  save_name  varchar2(500),
  file_size  number,
  PRIMARY 	  KEY(no),
  CONSTRAINT gallery_fk FOREIGN KEY (user_no)
  REFERENCES users(no)
);

insert into gallery
values (seq_gallery_no.nextval, '1', 'content', 'filePath', 'orgName', 'saveName', '1234');

insert into gallery
values (seq_gallery_no.nextval, '2', 'content', 'filePath', 'orgName', 'saveName', '1234');

insert into gallery
values (seq_gallery_no.nextval, '3', 'content', 'filePath', 'orgName', 'saveName', '1234');

insert into gallery
values (seq_gallery_no.nextval, '4', 'content', 'filePath', 'orgName', 'saveName', '1234');

insert into gallery
values (seq_gallery_no.nextval, '5', 'content', 'filePath', 'orgName', 'saveName', '1234');



commit;

select *
from gallery;