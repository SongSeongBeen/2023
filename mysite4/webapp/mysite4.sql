drop table users;
drop sequence SEQ_USERS_NO;

create sequence SEQ_USERS_NO
INCREMENT by 1
START with 1
nocache;

create table users(
    no number,
    id varchar2(20) not null unique,
    password varchar2(20) not null,
    name varchar2(20),
    gender varchar2(20),
    
    primary key(no)
);

drop SEQUENCE seq_rboard_no;
drop table rboard;

create sequence seq_rboard_no
increment by 1
start with 1
nocache;

create table rboard(
    no number,
    title varchar2(500),
    content varchar2(4000),
    hit number,
    reg_date date,
    user_no number not null,
    group_no number,
    order_no number,
    depth number,
    
    primary key(no),
    constraint fk_user_no foreign key(user_no) REFERENCES users(no)
);


set define off;
create or replace function depth_title( 
    title in varchar2, 
    depth in number
)return varchar2
    is
        str varchar2(1000);
        i number :=0;
    begin
        str := title;
        while(i<depth)
        loop
            str := concat('&nbsp;&nbsp;&nbsp;&nbsp;',str);
            i := i+1;
        end loop;        
    return str;
end;

drop table guestbook;
drop SEQUENCE seq_guestbook_no;

create table guestbook(
    no number,
    name varchar(80),
    password varchar2(20),
    content varchar2(2000),
    reg_date date,
    
    primary key(no)
);

create SEQUENCE seq_guestbook_no
increment by 1
start with 1
nocache;

drop table gallery;
drop sequence seq_gallery_no;

create sequence seq_gallery_no
INCREMENT by 1
start with 1
nocache;

create table gallery(
    no number,
    user_no number,
    content varchar2(1000),
    filePath varchar2(500),
    orgName varchar2(200),
    saveName varchar2(500),
    fileSize number,
    
    PRIMARY KEY (no),
    constraint user_no foreign key (user_no) references users (no)
);

drop table board;
drop sequence seq_board_no;

create table board( 
    no number primary key, 
    title varchar2(500) not null, 
    content varchar2(4000), 
    hit number default 0, 
    reg_date date not null,
    user_no number not null,
    
    constraint fk_no foreign key(user_no) references users(no)
);

create sequence seq_board_no
INCREMENT by 1
start with 1
nocache;